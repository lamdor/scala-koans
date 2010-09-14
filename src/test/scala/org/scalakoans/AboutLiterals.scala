package org.scalakoans

import support.KoanSuite

class AboutLiterals extends KoanSuite {
  koan("integer literals") {
    val i = 1

    i.isInstanceOf[Int] should __
  }

  koan("double literals") {
    val f = 2.0

    f.isInstanceOf[___] should be(true)
  }

  koan("string literals") {
    val s = "abcd"

    s.isInstanceOf[___] should be(true)

    s.toUpperCase() should __
    s.length() should __

    s.isInstanceOf[java.lang.String] should __

    // sadly no string interpolation
    val str = "%s - %d".format("abc", 123)
    str should __
  }

  koan("symbol literals") {
    val s = 'abc

    s.isInstanceOf[___] should be(true)

    __ should be theSameInstanceAs('abc)
  }
}
