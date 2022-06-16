package models

case class ResetPassword(
                                   email: String,
                                   newPassword: String,
                                   confirmPassword: String
                                 )


