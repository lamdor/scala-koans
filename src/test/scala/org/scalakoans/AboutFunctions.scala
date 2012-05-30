package org.scalakoans

import support.KoanSuite

class AboutFunctions extends KoanSuite {

  koan ("functions") {
    val add2 = (i: Int) => i + 2

    add2(2) should be(4)
    add2.apply(2) should be(4)

    // meditate
	val add3 = (i: Int) => i + 3
    add3(2) should be(5)
  }

  koan ("function has a type") {
    val add2 = { (i: Int) =>
      i + 2
    }

    add2.isInstanceOf[Function1[Int, Int]] should be(true)

    val addNumbers = { (i: Int, j: Int) =>
      i + j
    }

    addNumbers(2,3) should be(5)

    addNumbers.isInstanceOf[Function2[Int, Int, Int]] should be(true)
  }

  koan ("functions can be returned") {
    def makeAdder(i: Int) = (x: Int) => x + i

    val add2 = makeAdder(2)

    add2(3) should be(5)
  }

  koan ("functions can be taken in as parameters") {
    def callWith1AndAdd2(f: (Int) => Int) = f(1) + 2

    val result = callWith1AndAdd2 { i => i + 3 }

    result should be(6)
  }

  koan ("if function has only one parameter, _ can be used") {
    def callWith1AndAdd2(f: (Int) => Int) = f(1) + 2

    val result = callWith1AndAdd2 { _ + 3 }

    result should be(6)
  }

  koan ("objects and instances can be functions") {
    object Add2 {
      def apply(i: Int) = i + 2
    }

    Add2(3) should be(5)

    class Adder(i: Int) {
      def apply(j: Int) = i + j
    }

    val add3 = new Adder(3)
    add3(2) should be(5)
  }

}
