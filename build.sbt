import play.PlayScala



name := """play-scala-tutorial"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)


scalaVersion := "2.11.1"


libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws,
"org.webjars"    %%   "webjars-play"          % "2.3.0-2",
"org.webjars"    %    "bootstrap"             % "3.1.1-2",
"org.webjars"    %    "bootswatch-cerulean"   % "3.3.1+2",
"org.webjars"    %    "html5shiv"             % "3.7.0",
"org.webjars"    %    "respond"               % "1.4.2",
 "mysql"         %     "mysql-connector-java" % "5.1.21"
)

fork in run := true