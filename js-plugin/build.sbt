resolvers += Resolver.sonatypeRepo("releases")

resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("org.scala-lang.modules.scalajs" % "scalajs-sbt-plugin" % "0.3-SNAPSHOT")

libraryDependencies += "org.scala-sbt" % "test-interface" % "1.0"

organization := "com.lihaoyi"

name := "utest-js-plugin"

scalaVersion := "2.10.3"

version := "0.1.1"

sbtPlugin := true
