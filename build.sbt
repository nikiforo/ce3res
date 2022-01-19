ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "name.nikiforo"
ThisBuild / crossScalaVersions ++= Seq("2.12.15", "2.13.8")

val root = (project in file("."))
  .settings(
    name := "ce3res",
    libraryDependencies += "org.typelevel" %% "cats-effect" % "3.3.4"
  )