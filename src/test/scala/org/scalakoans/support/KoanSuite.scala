package org.scalakoans.support

import org.scalatest._
import org.scalatest.matchers.{Matcher, MatchResult, ShouldMatchers}
import org.scalatest.events._

trait KoanSuite extends FunSuite with ShouldMatchers {

  def koan(name : String)(fun: => Unit) = test(name)(fun)

  def meditate() = pending

  def  __ : Matcher[Any] = {
    throw new TestPendingException
  }

  protected class ___ extends Exception {
    override def toString() = "___"
  }

  private class ReportToTheMaster(other: Reporter) extends Reporter {
    var failed = false
    def failure(event: Event) {
      failed = true
      info("*****************************************")
      info("*****************************************")
      info("")
      info("")
      info("")
      info(Master.studentFailed(event))
      info("")
      info("")
      info("")
      info("*****************************************")
      info("*****************************************")
    }

    def apply(event: Event) {
      event match {
        case e: TestIgnored => failure(event)
        case e: TestFailed => failure(event)
        case e: TestPending => failure(event)
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
