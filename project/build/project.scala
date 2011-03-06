import sbt._
import org.fusesource.scalate.sbt.PrecompilerWebProject

class HelloScalateProject(info: ProjectInfo) extends AppengineProject(info) with PrecompilerWebProject {
  val scalate = "org.fusesource.scalate" % "scalate-core" % "1.4.1"
  val slf4j = "org.slf4j" % "slf4j-jdk14" % "1.6.1"
  val servlet = "javax.servlet" % "servlet-api" % "2.5" % "provided"

  // Compile templates whenever preparing the web app
  override def prepareWebappAction = super.prepareWebappAction && precompileTemplates

  //override def templateRoots = webappPath

}
