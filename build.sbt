lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """hello-world""",
    maintainer := "arshad@splendidhires.com",
    organization := "splendidhires",
    version := "1.0-SNAPSHOT",
    scalaVersion := "2.13.1",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
