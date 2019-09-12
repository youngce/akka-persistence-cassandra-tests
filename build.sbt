import com.typesafe.sbt.SbtMultiJvm.multiJvmSettings
import com.typesafe.sbt.SbtMultiJvm.MultiJvmKeys.MultiJvm

//name := "akka-persistence-cassandra-tests"
//
//version := "0.1"
//
//scalaVersion := "2.13.0"
//
//libraryDependencies ++= Seq(
//  "com.typesafe.akka" %% "akka-persistence-cassandra" % "0.99",
//  "com.typesafe.akka" %% "akka-persistence-cassandra-launcher" % "0.99" % Test
//)
//// https://mvnrepository.com/artifact/org.scalatest/scalatest
//libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
//// https://mvnrepository.com/artifact/com.typesafe.akka/akka-persistence
//libraryDependencies += "com.typesafe.akka" %% "akka-persistence" % "2.5.25"
//// https://mvnrepository.com/artifact/com.typesafe.akka/akka-testkit
//libraryDependencies += "com.typesafe.akka" %% "akka-testkit" % "2.5.25" % Test
//
//libraryDependencies += "com.typesafe.akka" %% "akka-multi-node-testkit" % "2.5.25"
////
////
//lazy val root = (project in file("."))
//  .enablePlugins(MultiJvmPlugin)
//  .configs(MultiJvm)
val akkaVersion="2.5.25"
val `akka-persistence-cassandra-tests` = project
  .in(file("."))
  .settings(multiJvmSettings: _*)
  .settings(
//    organization := "com.typesafe.akka.samples",
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % akkaVersion,
      "com.typesafe.akka" %% "akka-remote" % akkaVersion,
      "com.typesafe.akka" %% "akka-multi-node-testkit" % akkaVersion,
      "com.typesafe.akka" %% "akka-persistence" % akkaVersion,
      "org.scalatest" %% "scalatest" % "3.0.8" % Test),
    // disable parallel tests
    parallelExecution in Test := false,
//    licenses := Seq(("CC0", url("http://creativecommons.org/publicdomain/zero/1.0")))
  )
  .configs (MultiJvm)
