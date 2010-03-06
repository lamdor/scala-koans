package org.functionalkoans.forscala
import org.scalatest.matchers.ShouldMatchers
import support.BlankValues.__
import support.KoanSuite

class AboutAsserts extends KoanSuite with ShouldMatchers {

    koan ("should be true") {
        assert(false)   // should be true
    }

    koan ("should be true with message") {
        assert(false, "This should be true")
    }

    koan ("should be true with should matchers") {
        false should be (true)  // should be true
    }

    koan ("should match two equal values") {
        val v1 = 4
        val v2 = 3

        assert(v1 === v2)
    }

    koan ("sometimes we expect you to fill in the values") {
        assert( __ === 1+1 )
    }
}
