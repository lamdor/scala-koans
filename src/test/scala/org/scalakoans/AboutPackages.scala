package org.scalakoans

import support.KoanSuite

class AboutPackages extends KoanSuite {

  koan ("packages contain classes and objects") {
     val packageOfThisClass = classOf[AboutPackages].getName.split(".").dropRight(1).mkString(".")

     packageOfThisClass should be(__)
  }

  koan ("package namespaces") {
    // package is defined below
    val p = new abc.Person
    p.isInstanceOf[___] should be(true)

    import abc._
    p.isInstanceOf[___] should be(true)
  }

  koan ("imports are relative to existing imports") {
    // package is defined below
    import first._
    import inside._
    import evenMoreInside.Animal

    val a = new Animal
    a.isInstanceOf[___] should be(true)
  }

  koan ("import an object's methods") {
    object Colors {
      val BLUE = "BLUE"
      val RED = "RED"
    }

    import Colors._

    BLUE should be(__)
  }

  koan ("importing a variable's methods") {
    case class Person(val firstName: String)

    val person = Person("Lou")

    import person._

    firstName should be(__)
  }
}

package abc {
  class Person
}

package first {
  package inside {
    package evenMoreInside {
      class Animal
    }
  }
}

