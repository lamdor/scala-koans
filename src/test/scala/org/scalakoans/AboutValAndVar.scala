package org.scalakoans

import support.KoanSuite

class AboutValAndVar extends KoanSuite {

  koan("vars may be reassigned") {
    var a = 5
    a should be (5)

    a = 7
    a should be (7)
  }

  koan("vals may not be reassigned") {
    val a = 5
    a should be (5)

    // What happens if you uncomment these lines?
    // a = 7
    // a should be (5)
  }

}
