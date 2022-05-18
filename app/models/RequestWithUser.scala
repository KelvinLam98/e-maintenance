package models

import play.api.mvc.{Request, WrappedRequest}

case class RequestWithUser[A](user: User, request: Request[A]) extends WrappedRequest(request)