package org.scalakoans

import org.scalatest._

class Koans extends Suite {
  override def nestedSuites = List(
    new AboutAsserts
  )
}
