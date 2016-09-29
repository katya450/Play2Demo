name := """Play2Demo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJpa,
  javaJdbc,
  "org.hibernate" % "hibernate-entitymanager" % "5.1.0.Final",
  cache,
  javaWs,
  "org.postgresql" % "postgresql" % "9.4-1200-jdbc41",
  evolutions
)


