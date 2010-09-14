package org.scalakoans

import support.KoanSuite

class AboutClasses extends KoanSuite {

  koan ("Class") {
    class Thing {}

    val t = new Thing
    t.isInstanceOf[___] should be(true)

    meditate
    // t2.isInstanceOf[Thing2] should be(true)
  }

  koan ("Class getters") {
    class Person(val firstName: String)

    val p = new Person("Lou")
    p.firstName should __

    meditate
    // p.firstName() should __

    meditate
    // p.firstName = "Who"
  }

  koan ("Class getter/setters") {
    class Person(var firstName: String)

    val p = new Person("Lou")
    p.firstName should __

    p.firstName = "Who"
    p.firstName should __
  }

  koan ("Class private fields") {
    class Person(var firstName: String) {
      private val ssn = "111-11-1111"
    }

    val p = new Person("Lou")

    meditate
    // p.ssn should __
  }

  koan ("Class instance methods") {
    class Person(val firstName: String, val lastName: String) {
      def fullName = lastName + ", " + firstName

      def sayHelloTo(who: String) = {
        "Hello to %s from %s".format(who, firstName)
      }

      meditate
      // def firstNameLowerCase = ?
    }

    val p = new Person(firstName = "Lou", lastName = "Ferigno")
    p.fullName should __
    p.sayHelloTo("Who") should __

    meditate
    // p.firstNameLowerCase should __
  }

  koan ("Class constructor") {
    var x = 2

    class Thing {
      x += 2
    }

    x should __
    new Thing
    x should __
  }

  koan ("Class super class constructors") {
    class Animal(val name: String, val numberOfLegs: Int)

    class Cat(name: String) extends Animal(name, 4)

    val cat = new Cat("Lou")
    cat.name should __
    cat.numberOfLegs should __

    meditate
    // class Kangaroo
    // val roo = new Kangaroo("Rocky")
    // roo.name should be("Rocky")
    // roo.numberOfLegs should be(2)
  }

  koan ("override methods") {
    class Animal(val name: String) {
      def makeNoise = "noisy"
    }

    class Dog(name: String) extends Animal(name) {
      override def makeNoise = "woof"
    }

    (new Dog("Lassy")).makeNoise should __

    class Cat(name: String) extends Animal(name)

    (new Cat("Lou")).makeNoise should be("meow")
  }


  koan ("lightweight Case classes") {
    case class Cat(name: String)

    val lou = Cat("Lou")

    lou.name should __
    lou.toString should __

    val anotherLou = Cat("Lou")
    (lou == anotherLou) should __
  }

}
