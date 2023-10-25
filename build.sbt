ThisBuild / version := "1.0.0"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "BerlinerPattern",
    idePackagePrefix := Some("org.jetbrains.scala")
  )
