package models

case class ResetPassword(
                                   id: Long,
                                   newPassword: String,
                                   confirmPassword: String
                                 )


