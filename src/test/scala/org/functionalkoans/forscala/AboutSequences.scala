package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues._
import org.scalatest.matchers.ShouldMatchers

class AboutSequences extends KoanSuite with ShouldMatchers {

    koan("An empty array") {
        val empty = Array.empty
    }
}
