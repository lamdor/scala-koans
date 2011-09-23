package org.scalakoans

import support.KoanSuite

class AboutPackages extends KoanSuite {

  koan ("packages contain classes and objects") {
     val packageOfThisClass = classOf[AboutPackages].getName.split("\\.").dropRight(1).mkString(".")

     packageOfThisClass should be("org.scalakoans")
  }

  koan ("package namespaces") {
    // package is defined below
    val p = new abc.Person
    p.isInstanceOf[abc.Person] should be(true)

    import abc._
    p.isInstanceOf[Person] should be(true)
  }

  koan ("imports are relative to existing imports") {
    // package is defined below
    import first._
    import inside._
    import evenMoreInside.Animal

    val a = new Animal
    a.isInstanceOf[Animal] should be(true)
  }

  koan ("import an object's methods") {
    object Colors {
      val BLUE = "BLUE"
      val RED = "RED"
    }

    import Colors._

    BLUE should be("BLUE")
  }

  koan ("importing a variable's methods") {
    case class Person(val firstName: String)

    val person = Person("Lou")

    import person._

    firstName should be("Lou")
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

