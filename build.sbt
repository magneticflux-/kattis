name := "kattis"

version := "0.1"

scalaVersion := "2.12.6"

enablePlugins(JmhPlugin)

scalacOptions ++= Seq("-unchecked", "-deprecation")

libraryDependencies += "com.github.johnreedlol" %% "scala-trace-debug" % "5.0.0"