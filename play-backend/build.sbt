name := "play-backend"

version := "1.0"

scalaVersion := "2.13.3"

libraryDependencies ++= Seq(
  guice,
  "com.typesafe.play" %% "play-slick" % "5.0.0",
  "com.typesafe.play" %% "play-slick-evolutions" % "5.0.0",
  "com.typesafe.play" %% "play-json" % "2.9.1",
  "com.typesafe.play" %% "play" % "2.8.7"
)
