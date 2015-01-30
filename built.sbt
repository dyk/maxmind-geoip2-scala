name := "maxmind-geoip2-scala"

organization := "com.sanoma.cda"

version := "1.3.2.1"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  "com.maxmind.geoip2" % "geoip2" % "0.9.0",
  "com.twitter" %% "util-collection" % "6.8.0",
  "org.scalacheck" %% "scalacheck" % "1.10.0" % "test",
  "org.scalatest" %% "scalatest" % "1.9.1" % "test"
)
scalacOptions ++= Seq("-feature")
