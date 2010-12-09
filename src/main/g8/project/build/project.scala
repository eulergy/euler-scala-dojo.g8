import sbt._

class MyProject(info: ProjectInfo) extends DefaultProject(info) {
  val specs = "org.scala-tools.testing" %% "specs_2.8.0.Beta1" %"1.6.2.2" % "test"
}
