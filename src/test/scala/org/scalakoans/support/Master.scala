package org.scalakoans.support
import org.scalatest.events.Event

object Master {
  var studentNeedsToMeditate = false

  type HasTestNameAndSuiteName = {
    val suiteName: String
    val testName: String
  }

  def studentFailed(event: Event): String = {
    studentNeedsToMeditate = true
    return event match {
      case e: HasTestNameAndSuiteName => meditationMessage(e)
      case _ => ""
    }
  }

  private def meditationMessage(event: HasTestNameAndSuiteName) = {
    "Please meditate on koan \"%s\" of suite \"%s\"" format (event.testName, event.suiteName)
  }

}

