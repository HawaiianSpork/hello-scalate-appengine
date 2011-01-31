import sbt._

class Plugins(info: ProjectInfo) extends PluginDefinition(info) {
  val appenginePlugin = "net.stbbs.yasushi" % "sbt-appengine-plugin" % "2.2"
  val scalatePlugin = "net.stbbs.yasushi" % "sbt-scalate-plugin" % "1.1"
}
