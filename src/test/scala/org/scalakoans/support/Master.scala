package org.scalakoans.support
import org.scalatest.events.Event

object Master {
  var studentNeedsToMeditate = false

  def studentFailed(event: Event): String = {
    studentNeedsToMeditate = true
    return "Please Meditate"
  }
}

