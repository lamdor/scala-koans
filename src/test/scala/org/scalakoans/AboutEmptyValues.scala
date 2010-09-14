package org.scalakoans

import support.KoanSuite

class AboutEmptyValues extends KoanSuite {

  koan ("None equals None") {
    None should __
  }

  test ("None should be identical to None") {
    val a = None
    a should __  // note that eq denotes identity, and == denotes equality in Scala
  }

  test ("None can be converted to a String") {
    None.toString should be(__)
  }

  test ("An empty list can be represented by another nothing value: Nil") {
    List() should be(__)
  }

  test ("None can be converted to an empty list") {
    val a = None
    a.toList should be(__)
  }

  test ("None is considered empty") {
    None.isEmpty should be(__)
  }

  test ("None can be cast Any, AnyRef or AnyVal") {
    None.asInstanceOf[Any] should be(__)
    None.asInstanceOf[AnyRef] should be(__)
    None.asInstanceOf[AnyVal] should be(__)
  }

  test ("None cannot be cast to all types of objects") {
    intercept[___] {
      None.asInstanceOf[String]
    }
  }

  test ("None can be used with Option instead of null references") {
    var optional : Option[String] = None
    optional.isEmpty should be(__)
    optional should be(__)
  }

  test ("Some is the opposite of None for Option types") {
    var optional : Option[String] = Some("Some Value")
    (optional == None) should be(__)
    optional.isEmpty should be(__)
  }

  test ("Option.getOrElse can be used to provide a default in the case of None") {
    var optional : Option[String] = Some("Some Value")
    var optional2 : Option[String] = None
    optional.getOrElse("No Value") should be(__)
    optional2.getOrElse("No Value") should be(__)
  }
}
