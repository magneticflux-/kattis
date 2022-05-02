name := "kattis"

version := "0.1"

scalaVersion := "2.13.8"

enablePlugins(JmhPlugin)

scalacOptions ++= Seq("-Xlint:unused", "-unchecked", "-deprecation", "-Xsource:3")

libraryDependencies += "org.scala-lang.modules" %% "scala-parallel-collections" % "1.0.4"
