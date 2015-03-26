lazy val root = (project in file("."))
    .configs(IntegrationTest)
    .settings(baseSettings: _*)
    .settings(Defaults.itSettings: _*)
    .settings(libraryDependencies ++= deps ++ testDeps)
    .settings(
      Seq(
        fork := true,
        javaOptions := Seq(s"-Drun.message=${newMessage()}")
      )
    )

lazy val baseSettings = Seq(
  name := "sbt-spike",
  organization := "com.braxisltd",
  version := "1.0",
  scalaVersion := "2.11.6"
)

lazy val deps = Seq(
  "com.typesafe" % "config" % "1.2.1"
)

lazy val testDeps = Seq(
  "org.scalatest" %% "scalatest" % "2.2.4"
).map(_ % "it,test")

def newMessage() = "\"This is the NEW message!!!\""