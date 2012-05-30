package org.scalakoans

import support.KoanSuite

class AboutLiterals extends KoanSuite {
  koan("integer literals") {
    val i = 1

    i.isInstanceOf[Int] should be (true)
  }

  koan("double literals") {
    val f = 2.0

    f.isInstanceOf[Double] should be(true)
  }

  koan("string literals") {
    val s = "abcd"

    s.isInstanceOf[String] should be(true)

    s.toUpperCase() should be ("ABCD")
    s.length() should be (4)

    s.isInstanceOf[java.lang.String] should be (true)

    // sadly no string interpolation
    //val str = "%s - %d".format("abc", 123)
    //str should be ("")
  }

  koan("symbol literals") {
    val s = 'abc

    s.isInstanceOf[Symbol] should be(true)

    s should be theSameInstanceAs('abc)
  }
}
