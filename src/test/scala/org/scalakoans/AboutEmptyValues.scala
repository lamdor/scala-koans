package org.scalakoans

import support.KoanSuite

class AboutEmptyValues extends KoanSuite {

  koan ("None equals None") {
    None should equal (None)
  }

  test ("None should be identical to None") {
    val a = None
    a should equal (None)  // note that eq denotes identity, and == denotes equality in Scala
  }

  test ("None can be converted to a String") {
    None.toString should be("None")
  }

  test ("An empty list can be represented by another nothing value: Nil") {
    List() should be(Nil)
  }

  test ("None can be converted to an empty list") {
    val a = None
    a.toList should be(Nil)
  }

  test ("None is considered empty") {
    None.isEmpty should be(true)
  }

  test ("None can be cast Any, AnyRef or AnyVal") {
    None.asInstanceOf[Any] should be(None)
    None.asInstanceOf[AnyRef] should be(None)
    None.asInstanceOf[AnyVal] should be(None)
  }

  test ("None cannot be cast to all types of objects") {
    intercept[Exception] {
      None.asInstanceOf[String]
    }
  }

  test ("None can be used with Option instead of null references") {
    var optional : Option[String] = None
    optional.isEmpty should be(true)
    optional should be(None)
  }

  test ("Some is the opposite of None for Option types") {
    var optional : Option[String] = Some("Some Value")
    (optional == None) should be(false)
    optional.isEmpty should be(false)
  }

  test ("Option.getOrElse can be used to provide a default in the case of None") {
    var optional : Option[String] = Some("Some Value")
    var optional2 : Option[String] = None
    optional.getOrElse("No Value") should be("Some Value")
    optional2.getOrElse("No Value") should be("No Value")
  }
}
