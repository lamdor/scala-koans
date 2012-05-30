package org.scalakoans

import support.KoanSuite

class AboutObjects extends KoanSuite {

  koan ("singleton objects") {
    object Thing {
      def add2(i: Int) = i + 2
	  def add3(i: Int) = i + 3
    }

    Thing.add2(2) should be (4)

    //meditate
	Thing.add3(4) should be(7)
  }

  koan ("singleton objects can extend classes") {
    class Cat(val name: String, val meow: String)

    object LouFerigno extends Cat("Lou", "meow")
    LouFerigno.name should be ("Lou")

    //meditate
    LouFerigno.meow should be("meow")
  }

  koan ("Singleton objects are good for constants") {
    object Constants {
      val RED = "RED"
      val GREEN = "green"
    }

    Constants.RED should be ("RED")
  }

}
