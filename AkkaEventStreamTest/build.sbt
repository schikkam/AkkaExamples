name := "Test AkkaEventStream_Project"

version := "1.0"

scalaVersion := "2.11.7"

val akkaVersion = "2.4.0"

libraryDependencies +=  "com.typesafe.akka" % "akka-actor_2.11" % akkaVersion

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
