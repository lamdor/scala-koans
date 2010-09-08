package org.scalakoans

import support.KoanSuite

class AboutAsserts extends KoanSuite {

  koan ("should be true") {
    assert(false)   // should be true
  }

  koan ("should be true with message") {
    assert(false, "This should be true")
  }

  koan ("should be true with should matchers") {
    false should be (true)  // should be true
  }

  koan ("should match two equal values") {
    val v1 = 4
    val v2 = 3

    meditate
    v1 should be(v2)
  }

  koan("can also use equal as a matcher") {
    val v1 = 4
    val v2 = 3

    __ should equal(v2)
  }

  koan ("sometimes we expect you to fill in the values") {
    (1+1) should __
  }
}
