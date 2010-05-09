import sbt._

class Project(info: ProjectInfo) extends DefaultProject(info) {
  val scalaToolsSnapshots = "Scala-Tools Maven2 Snapshots Repository" at "http://scala-tools.org/repo-snapshots"

  val scalatest = "org.scalatest" % "scalatest" % "1.1-SNAPSHOT" % "test" withSources()
  val junit = "junit" % "junit" % "4.8.1" % "test" withSources()
}
