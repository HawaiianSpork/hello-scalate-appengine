import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val appenginePlugin = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.2"
  val scalatePlugin = "org.fusesource.scalate" % "sbt-scalate-plugin" % "1.4.1"
}
