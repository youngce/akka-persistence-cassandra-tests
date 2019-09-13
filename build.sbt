

name := "akka-persistence-cassandra-tests"
version := "0.1"
scalaVersion := "2.13.0"
val akkaVersion="2.5.25"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % akkaVersion,
  "com.typesafe.akka" %% "akka-remote" % akkaVersion,
  "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
  "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
  "com.typesafe.akka" %%"akka-persistence-cassandra" % "0.99",
  "org.scalatest" %% "scalatest" % "3.0.8" % Test)
// disable parallel tests
parallelExecution in Test := false
