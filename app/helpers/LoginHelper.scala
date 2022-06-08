package helpers

import helpers.{CryptoHelper}
import models.{LoginResponse, User}
import play.api.libs.json.Json
import play.api.mvc.Result
import play.api.mvc.Results.Ok
import stores.UserStore

import java.sql.Connection
import java.util.Date
import javax.inject.Inject

class LoginHelper @Inject()(
                             userStore: UserStore,
                           ) {

  def login(user: User, appName: Option[String])(implicit conn: Connection): Result = {
    val currentDate = new Date
    val accessBitSet = new java.util.BitSet()
    accessBitSet.set(1) // Always set normal user access.
    val accessRights = accessBitSet.toByteArray
    val loginInfo = user
    val jwtToken = CryptoHelper.encodeJWT(loginInfo)
    val readOnlyJwtToken = CryptoHelper.encodeReadOnlyJWT(loginInfo)
    val userInfo = user
    //    val loginSession = LoginSession(None, user.email, currentDate, currentDate, None)
    //    loginSessionStore.insert(loginSession)
    Ok(Json.toJson(LoginResponse(loginIsAuthenticated = true, Some(jwtToken), Some(readOnlyJwtToken), Some(userInfo), None, accessRights)))
  }

}