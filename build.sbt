ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.8"

lazy val root = (project in file("."))
  .settings(
    name := "scala-jlink"
  )
  .enablePlugins(JlinkPlugin)

jlinkOptions ++= Seq(
  "--no-header-files",
  "--no-man-pages",
  "--strip-debug",
  "--compress=2"
)
