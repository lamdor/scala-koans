package org.scalakoans

import support.KoanSuite

class AboutClasses extends KoanSuite {

  koan ("Class") {
    class Thing {}

    val t = new Thing
    t.isInstanceOf[Thing] should be(true)

    // meditate
	class Thing2{}
	val t2 = new Thing2
    t2.isInstanceOf[Thing2] should be(true)
  }

  koan ("Class getters") {
    class Person(val firstName: String)

    val p = new Person("Lou")
    p.firstName should be ("Lou")

    //meditate
	// p.firstName() should be ()

    //meditate
  	// p.firstName = "Who"
  }

  koan ("Class getter/setters") {
    class Person(var firstName: String)

    val p = new Person("Lou")
    p.firstName should be ("Lou")

    p.firstName = "Who"
    p.firstName should be ("Who")
  }

  koan ("Class private fields") {
    class Person(var firstName: String) {
      private val ssn = "111-11-1111"
    }

    val p = new Person("Lou")

    //meditate
    // p.ssn should __
  }

  koan ("Class instance methods") {
    class Person(val firstName: String, val lastName: String) {
      def fullName = lastName + ", " + firstName

      def sayHelloTo(who: String) = {
        "Hello to %s from %s".format(who, firstName)
      }

      //meditate
      def firstNameLowerCase = {
		firstName.toLowerCase()
	  }
    }

    val p = new Person(firstName = "Lou", lastName = "Ferigno")
    p.fullName should be ("Ferigno, Lou")
    p.sayHelloTo("Who") should be ("Hello to Who from Lou")

    // meditate
     p.firstNameLowerCase should be ("lou")
  }

  koan ("Class constructor") {
    var x = 2

    class Thing {
      x += 2
    }

    x should be (2)
    new Thing
    x should be (4)
  }

  koan ("Class super class constructors") {
    class Animal(val name: String, val numberOfLegs: Int)

    class Cat(name: String) extends Animal(name, 4)

    val cat = new Cat("Lou")
    cat.name should be ("Lou")
    cat.numberOfLegs should be (4)

    //meditate
    class Kangaroo(name: String) extends Animal(name, 2)
   	val roo = new Kangaroo("Rocky")
    roo.name should be("Rocky")
    roo.numberOfLegs should be(2)
  }

  koan ("override methods") {
    class Animal(val name: String) {
      def makeNoise = "noisy"
    }

    class Dog(name: String) extends Animal(name) {
      override def makeNoise = "woof"
    }

    (new Dog("Lassy")).makeNoise should be ("woof")

    class Cat(name: String) extends Animal(name) {
		override def makeNoise = "meow"
	}

    (new Cat("Lou")).makeNoise should be("meow")
  }

  koan ("lazy vals") {
    class Thing {
      var x = 0

      lazy val longToCompute = {
        // takes a while
        x += 1
        3
      }
    }

    val t = new Thing
    t.x should be(0)
    t.longToCompute should be(3)
    t.x should be(1)
    t.longToCompute should be(3)
    t.x should be(1)
  }


  koan ("lightweight Case classes") {
    case class Cat(name: String)

    val lou = Cat("Lou")

    lou.name should be ("Lou")
    lou.toString should be ("Cat(Lou)")

    val anotherLou = Cat("Lou")
    (lou == anotherLou) should be (true)

    val anotherCat = lou.copy(name = "who")
    anotherCat.name should be("who")
  }

}
