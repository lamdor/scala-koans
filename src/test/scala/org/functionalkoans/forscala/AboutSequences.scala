package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues._
import org.scalatest.matchers.ShouldMatchers

class AboutSequences extends KoanSuite with ShouldMatchers {

    koan("A list can be converted to an array") {
        val l = List(1,2,3)
        val a = l.toArray
        a should equal (Array(1,2,3))
    }
}
