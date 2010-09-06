import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val scalatest = "org.scalatest" % "scalatest" % "1.2" % "test"

  log.setTrace(-1)

  lazy val koans = testOnlyAction(Array("org.scalakoans.Koans")) describedAs "Run through the Scala Koans"
}
