package stores

import java.io.{ByteArrayInputStream, _}
import java.sql.Connection

import anorm._
import helpers.HexBytesHelper
import javax.inject.Inject
import models._


class UserPushNotifTokenStore @Inject()(hexBytesHelper: HexBytesHelper) {

  val userParser: RowParser[UserPushNotifToken] = Macro.namedParser[UserPushNotifToken]

  def findAll()(implicit conn: Connection): Seq[UserPushNotifToken] =
    SQL("select * from user_push_notif_tokens").as(userParser.*)   // TODO: Add in the start and end date condition

  def findByUserIdAppNameMiddleWareTokenOs(user_id: Long, token_os: String)(implicit conn: Connection): Option[UserPushNotifToken] = {
    SQL("select * from user_push_notif_tokens where user_id = {user_id} and token_os = {token_os}").on(
      "user_id" -> user_id,
      "token_os" -> token_os
    ).as(userParser.singleOpt)
  }

  def findByPushToken(implicit conn: Connection): Seq[UserPushNotifToken] = {
    SQL("select * from user_push_notif_tokens where push_token is not null").on(
    ).as(userParser.*)
  }

  def countAll(implicit conn: Connection): Long = {
    SQL("select count(*) as count from user_push_notif_tokens").as(SqlParser.long("count").single)
  }

  def countFiltered(searchText: String)(implicit conn: Connection): Long = {
    val searchCriteria =
      if(searchText.isEmpty)
        ""
      else
        "where (user_id like {searchText})"

    SQL("select count(*) as count from user_push_notif_tokens " + searchCriteria).on(
      "searchText" -> ("%" + searchText + "%")
    ).as(SqlParser.long("count").single)
  }

  def search(searchText: String,limit:Option[LimitClause],orderBy:Option[OrderByClause])(implicit conn: Connection): Seq[UserPushNotifToken] = {
    val orderCriteria = orderBy.map(_.value).getOrElse("")
    val searchCriteria =
      if(searchText.isEmpty)
        "" + orderCriteria
      else
        "where (user_id like {searchText})"+ orderCriteria

    val namedParams: Seq[NamedParameter] =
      Vector[NamedParameter](

        "searchText" -> ("%" + searchText + "%"),
      ) ++ limit.map(_.namedParameters).getOrElse(Seq.empty[NamedParameter])
    SQL("select * from user_push_notif_tokens " + searchCriteria + limit.map(_.value).getOrElse("")).on(namedParams: _*).as(userParser.*)
  }

  def insert(push_token: String, token_os: String, raw_token: Option[String], user_id: Long)(implicit conn: Connection) = {
    SQL("insert into user_push_notif_tokens (user_id, push_token, token_os, raw_token)  " +
      "values ({user_id}, {push_token}, {token_os}, {raw_token})").on(
      "user_id" -> user_id,
      "push_token" -> push_token,
      "token_os" -> token_os,
      "raw_token" -> raw_token
    ).executeInsert()
  }

  def update(push_token: String, token_os: String, raw_token: Option[String], user_id: Long)(implicit conn: Connection) = {
    SQL("update user_push_notif_tokens set push_token = {push_token}, raw_token = {raw_token} where user_id = {user_id} and token_os = {token_os}").on(
      "push_token" -> push_token,
      "token_os" -> token_os,
      "raw_token" -> raw_token,
      "user_id" -> user_id
    ).executeUpdate()
  }

  def delete(id: Long)(implicit conn: Connection) = {
    SQL("delete from user_push_notif_tokens where id = {id}").on(
      "id" -> id
    ).executeUpdate()
  }

  def deleteByEmailPushTokenAndOs(user_id: String, push_token: String, token_os: String)(implicit conn: Connection) = {
    SQL("delete from user_push_notif_tokens where user_id = {user_id} and push_token = {push_token} and token_os = {token_os}").on(
      "user_id" -> user_id,
      "push_token" -> push_token,
      "token_os" -> token_os
    ).executeUpdate()
  }
}