package appcontrollers

import helpers._

import java.util.Date
import javax.inject.{Inject, Singleton}
import models._
import play.api.cache.SyncCacheApi
import play.api.db.{Database, NamedDatabase}
import play.api.libs.json._
import play.api.libs.mailer.Email
import play.api.mvc.Results.Ok
import play.api.mvc.{Action, AnyContent, MessagesControllerComponents, Result}
import stores._
import services.ConfigurationService

import java.net.URLEncoder
import java.sql.Connection
import scala.concurrent.{ExecutionContext, Future}
import play.api.libs.ws._
import akka.stream.scaladsl.{Source, StreamConverters}
import akka.util.ByteString
import java.io._
import javax.imageio.ImageIO

@Singleton
class Users @Inject()(
                       mcc: MessagesControllerComponents,
                       db: Database,
                       userStore: UserStore,
                       cacheApi: SyncCacheApi,
                       loginHelper: LoginHelper,
                       configurationService: ConfigurationService,
                       userPushNotifTokenStore: UserPushNotifTokenStore,
                       workOrderStore: WorkOrderStore,
                       ws: WSClient,
                       firebaseHelper: FirebaseHelper,
                     )(implicit execCtx: ExecutionContext) extends Bases(mcc, db, userStore, cacheApi) {

  def loginApi: Action[AnyContent] = ApiAction { implicit request =>
    withConnection { implicit conn =>
      val json = request.body.asJson.get
      json.validate[LoginRequest].fold(
        valid = { input =>
          userStore.findByEmail(input.loginEmail) match {
            case Some(user) =>
              if (input.loginPassword == user.password) {
                loginHelper.login(user, None)
              } else Ok("Wrong username or password")
            case None =>
              Ok("Wrong username or password")
          }
        }, invalid = { error =>
          Ok(Json.toJson(ErrorResponse("Invalid JSON: " + error.toString(), 400)))
        }
      )
    }
  }

  def profile(id: Long) = ApiAction { implicit request =>
    val draw: Int = request.getQueryString("draw").map(_.toInt).getOrElse(0)
    val searchText = request.getQueryString("searchText").getOrElse("")
    val limit = LimitClause.fromRequest(request)
    val orderBy = OrderByClause.fromRequest(request, WorkOrder.sortableCols)

    db.withConnection { implicit conn =>
      val total = userStore.countAll
      val filtered = userStore.countFiltered(searchText)
      val data = userStore.searchProfileById(id, searchText, limit, orderBy)
      Ok(Json.obj(
        "draw" -> draw,
        "recordsTotal" -> total,
        "recordsFiltered" -> filtered,
        "data" -> data
      ))
    }
  }

  def postUpdateProfile(id: Long): Action[AnyContent] = ApiAction { implicit request =>
    withConnection { implicit conn =>
      val json = request.body.asJson.get
      json.validate[UpdateProfileRequest].fold(
        valid = { input =>
          userStore.findById(id) match {
            case Some(user) =>
              userStore.update(User(
                user.id, user.username, user.password, input.name, input.ic_number, input.contact_number, input.address, input.email, user.role, user.created, new Date
              ))
              Ok(Json.toJson("Update Successfully"))
            case None =>
              Ok("Please contact admin")
          }
        }, invalid = { error =>
          Ok(Json.toJson(ErrorResponse("Invalid JSON: " + error.toString(), 400)))
        }
      )
    }
  }

  def postUpdatePassword(id: Long): Action[AnyContent] = ApiAction { implicit request =>
    withConnection { implicit conn =>
      val json = request.body.asJson.get
      json.validate[UpdatePasswordRequest].fold(
        valid = { input =>
          userStore.findById(id) match {
            case Some(user) =>
              if (input.oldPassword == user.password) {
              if (input.password == input.confirmPassword) {
                userStore.update(User(
                  user.id, user.username, input.password, user.name, user.ic_number, user.contact_number, user.address, user.email, user.role, user.created, new Date
                ))
                Ok(Json.toJson(UpdatePasswordResponse(isChange = true, responseMessage =" Update Successfully")))
              } else Ok(Json.toJson(UpdatePasswordResponse(isChange = false, responseMessage = "Passwords entered is different")))
            }else Ok(Json.toJson(UpdatePasswordResponse(isChange = false, responseMessage = "Incorrect Old Password")))
            case None =>
              Ok("Please contact admin")
          }
        }, invalid = { error =>
          Ok(Json.toJson(ErrorResponse("Invalid JSON: " + error.toString(), 400)))
        }
      )
    }
  }

  /* TODO NOTIFICATION */
  def registerFirebaseToken = SecuredApiAction(UserRole.USER).async { implicit request =>
    println("here in register token")
    val userId = request.user.id.get
    println(userId)
    logger.error("-----> In registerFirebaseToken API")
    try {
      val json = request.body.asJson.get
      json.validate[FirebaseRegistration].fold(
        valid = { model =>
          logger.error("-----> Getting input: " + model)

          if (model.os == "ios") {
            logger.error("-----> Inside IOS")

            ws.url("https://iid.googleapis.com/iid/v1:batchImport")
              .withHttpHeaders(
                "Authorization" -> s"key=${configurationService.firebaseServerKey}",
                "Content-Type" -> "application/json"
              )
              .post(Json.obj(
                "application" -> configurationService.firebaseBundleId,
                "sandbox" -> configurationService.firebaseSandbox,
                "apns_tokens" -> Json.arr(model.token)
              )).map { response =>
              try {
                val results = (response.json \ "results").validate[JsArray].get.value
                logger.error("-----> Results: " + results)

                if (results.length == 1) {
                  val head = results.head
                  val status = (head \ "status").validate[String].get
                  logger.error("-----> Status: " + status)

                  if (status == "OK") {
                    val firebaseToken = (head \ "registration_token").validate[String].get
                    logger.error("-----> Firebase Token: " + firebaseToken)

                    db.withTransaction { implicit conn =>
                      if (userPushNotifTokenStore.findByUserIdAppNameMiddleWareTokenOs(userId, model.os).isEmpty) {
                        userPushNotifTokenStore.insert(model.token, model.os, None, userId)
                        Ok(Json.toJson(UserUpdateFirebaseResponse(true, "Register Successfully")))
                      } else {
                        userPushNotifTokenStore.update(firebaseToken, model.os, Some(model.token), userId)
                        Ok(Json.toJson(UserUpdateFirebaseResponse(true, "userUpdatedSuccessfully")))
                      }
                    }
                  } else
                    Ok(Json.toJson(ErrorResponse("Expected Firebase server to return only one result with status = OK, but got = " + head, 400)))
                } else
                  Ok(Json.toJson(ErrorResponse("Expected Firebase server to return only one result, but got = " + results, 400)))
              }
              catch {
                case t: Throwable =>
                  t.printStackTrace()
                  Ok(Json.toJson(ErrorResponse("Failure to process response from Firebase server, t = " + t + ", response: " + response, 400)))
              }
            }
          }
          else {
            logger.error("-----> Inside Android OS")

            db.withTransaction { implicit conn =>
              if (userPushNotifTokenStore.findByUserIdAppNameMiddleWareTokenOs(userId, model.os).isEmpty) {
                userPushNotifTokenStore.insert(model.token, model.os, Some(model.token), userId)
                Future.successful(Ok(Json.toJson(UserUpdateFirebaseResponse(true, "Register Successfully"))))
              } else {
                userPushNotifTokenStore.update(model.token, model.os, None, userId)
                Future.successful(Ok(Json.toJson(UserUpdateFirebaseResponse(true, "userUpdatedSuccessfully"))))
              }
            }
          }
        },
        invalid = { error =>
          Future.successful(Ok(Json.toJson(ErrorResponse("Invalid JSON. error = " + error, 400))))
        }
      )
    } catch {
      case t: Throwable =>
        Future.successful(Ok(Json.toJson(ErrorResponse("Invalid JSON. t = " + t, 400))))
    }
  }

  def testSendPushNotification(workOrderId: Long) = SecuredApiAction(UserRole.ADMIN).async { implicit request =>
    db.withConnection { implicit conn =>
      workOrderStore.findById(workOrderId) match {
        case Some(workOrder) => {
          val futures: Seq[Future[Any]] =
            userPushNotifTokenStore.findByPushToken.map { user =>
              firebaseHelper.sendNotificationMessage(user.push_token.get, workOrder.status, "Notification", "module", "src", workOrderId.toString).map { messageId =>
                println("Sent, message ID: " + messageId + user.id)
              }
            }
          Future.sequence(futures).map { _ =>
            Ok(Json.toJson(NotificationSentResponse(true, "Notification Sent Successfully")))
          }
        }

        case None =>
          Future.successful(NotFound("Work Order ID not found."))
      }
    }
  }
}