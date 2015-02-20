name := "HelloWorld"

version := "1.0-SNAPSHOT"

//scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache
)     

play.Project.playJavaSettings
