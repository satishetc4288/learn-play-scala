name := """learn-play-scala"""
organization := "satish-org"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.14"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.0" % Test

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "learn-play-scala.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "learn-play-scala.binders._"
