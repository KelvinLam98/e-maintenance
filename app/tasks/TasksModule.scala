package tasks

import actors.FirebaseActor
import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport

class TasksModule extends AbstractModule with AkkaGuiceSupport {
  override def configure = {
    bindActor[FirebaseActor]("firebase-actor")
  }
}