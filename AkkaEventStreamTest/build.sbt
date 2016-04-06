name := "Test AkkaEventStream_Project"

version := "1.0"

scalaVersion := "2.11.7"

val akkaVersion = "2.4.0"

libraryDependencies ++= Seq(
  "org.specs2" % "specs2_2.11" % "3.3.1" % "test",
  "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test",
  "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion
)

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"



