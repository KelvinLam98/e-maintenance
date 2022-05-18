lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """e-maintenance""",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      guice,
      ws,
      jdbc,
      evolutions,
      ehcache,
      "com.h2database" % "h2" % "1.4.199",
      "mysql" % "mysql-connector-java" % "5.1.44",
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test,
      "org.mindrot" % "jbcrypt" % "0.4",
      "javax.mail" % "mail" % "1.4",
      "com.typesafe.play" %% "play-mailer" % "7.0.1",
      "com.typesafe.play" %% "play-mailer-guice" % "7.0.1",
      "org.playframework.anorm" %% "anorm" % "2.6.10",
      "org.eclipse.birt.runtime" % "org.eclipse.birt.runtime" % "4.2.2" exclude ("milyn", "flute")
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
