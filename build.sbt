name := "GlobalIssueSample"

version := "1.0-SNAPSHOT"

play.Project.playJavaSettings

libraryDependencies ++= Seq(
  "com.google.inject" % "guice" % "3.0"
)

lazy val module = project.in(file("module"))

lazy val main = project.in(file(".")).dependsOn(module).aggregate(module)
