import sbt._

class HelloScalateProject(info: ProjectInfo) extends AppengineProject(info) with net.stbbs.yasushi.ScalatePlugin {
  val scalate = "org.fusesource.scalate" % "scalate-core" % "1.3"
  val slf4j = "org.slf4j" % "slf4j-jdk14" % "1.6.1"
  val servlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"

  //override def templateRoots = webappPath

}
