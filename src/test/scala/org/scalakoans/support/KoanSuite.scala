package org.scalakoans.support

import org.scalatest._
import org.scalatest.matchers.{Matcher, MatchResult, ShouldMatchers}
import org.scalatest.events._

trait KoanSuite extends FunSuite with ShouldMatchers {

  def koan(name : String)(fun: => Unit) = test(name)(fun)

  def meditate() = pending

  val __ = new Matcher[Any] {
    def apply(left: Any) = {
      MatchResult(false, "meditate", "mediate")
    }
  }

  protected class ___ extends Exception {
    override def toString() = "___"
  }

  private class ReportToTheMaster(other: Reporter) extends Reporter {
    def apply(event: Event) {
      event match {
        case e: TestIgnored => info(Master.studentFailed(event))
        case e: TestFailed => info(Master.studentFailed(event))
        case e: TestPending => info(Master.studentFailed(event))
        case _ =>
      }
      other(event)
    }
  }

  protected override def runTest(testName: String, reporter: Reporter, stopper: Stopper, configMap: Map[String, Any], tracker: Tracker) {
    if (!Master.studentNeedsToMeditate) {
      super.runTest(testName, new ReportToTheMaster(reporter), stopper, configMap, tracker)
    }
  }

}
