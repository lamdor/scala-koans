package org.scalakoans

import support.KoanSuite

class AboutTraits extends KoanSuite {

  koan ("traits") {
    trait SaysHello {
      def sayHello(name: String) = "hello " + name
    }

    class Thing extends SaysHello

    (new Thing).sayHello("Lou") should be("hello Lou")
  }

  koan ("traits can have abstract members which must be implemented") {
    trait SaysHello {
      val name: String
      def sayHello = "hello " + name
    }

    case class Person(name: String) extends SaysHello
    val p = Person("lou")

    p.sayHello should be("hello lou")
  }

  koan ("multiple traits can be mixed in") {
    trait SaysHello {
      val name: String
      def sayHello = "hello " + name
    }

    trait SaysHelloTwice extends SaysHello {
      override def sayHello = super.sayHello + " " + super.sayHello
    }

    case class Person(name: String) extends SaysHello with SaysHelloTwice

    val p = Person("lou")

    p.sayHello should be("hello lou hello lou")
  }

  koan ("traits cannot have a constructor") {
    // meditate
    // trait SaysHello(name: String) {
    //   def sayHello = "hello " + name
    // }
  }

}
