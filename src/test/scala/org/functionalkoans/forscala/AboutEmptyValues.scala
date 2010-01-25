package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues._
import org.scalatest.matchers.ShouldMatchers


class AboutEmptyValues extends KoanSuite with ShouldMatchers {

    test ("None equals None") {
        assert(None == None )
    }

    test ("None should be identical to None") {
        val a = None
        assert(a eq None )  // note that eq denotes identity, and == denotes equality in Scala
    }

    test ("None can be converted to a String") {
        assert(None.toString == "None" )
    }

    test ("An empty list can be represented by another value: Nil") {
        assert(List() == Nil )
    }

    test ("None can be converted to an empty list") {
        val a = None
        assert(a.toList == Nil )
    }

    test ("Nil ")

    test ("None is considered empty") {
        assert(None.isEmpty == true )
    }

    test ("None can be cast Any, AnyRef or AnyVal") {
        assert(None.asInstanceOf[Any] == None)
        assert(None.asInstanceOf[AnyRef] == None)
        assert(None.asInstanceOf[AnyVal] == None)
    }

    test ("None cannot be cast to all types of objects") {
        intercept[ClassCastException] {
            assert(None.asInstanceOf[String] == None)
        }
    }

    test ("None can be used with Option instead of null references") {
        var optional : Option[String] = None
        assert(optional.isEmpty == true)
        assert(optional == None)
    }

    test ("Some is the opposite of None for Option types") {
        var optional : Option[String] = Some("Some Value")
        assert((optional == None) == false, "Some(value) should not equal None")
        assert(optional.isEmpty == false, "Some(value) should not be empty")
    }

    test ("Option.getOrElse can be used to provide a default in the case of None") {
        var optional : Option[String] = Some("Some Value")
        var optional2 : Option[String] = None
        assert(optional.getOrElse("No Value") == "Some Value", "Should return the value in the option")
        assert(optional2.getOrElse("No Value") == "No Value", "Should return the specified default value")
    }
}
