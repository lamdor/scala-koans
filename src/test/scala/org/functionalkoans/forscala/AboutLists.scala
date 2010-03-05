package org.functionalkoans.forscala

import support.KoanSuite
import support.BlankValues._
import org.scalatest.matchers.ShouldMatchers

class AboutLists extends KoanSuite with ShouldMatchers {

    test ("Nil lists are identical, even of different types") {
        val a : List[String] = Nil
        val b : List[Int] = Nil

        (a == Nil) should be (true)
        (a eq Nil) should be (true)

        (b == Nil) should be (true)
        (b eq Nil) should be (true)

        (a == b) should be (true)
        (a eq b) should be (true)
    }

    test ("Lists are easily created") {
        val a = List(1,2,3)
        a should equal (List(1,2,3))
    }

    test ("Lists can be accessed via head and tail") {
        val a = List(1,2,3)
        a.head should equal (1)
        a.tail should equal (List(2,3))
    }

    test ("Lists can accessed at random") {
        val a = List(1,3,5,7,9)
        a(0) should equal (1)
        a(2) should equal (5)
        a(4) should equal (9)

        intercept[NoSuchElementException] {
            println(a(5))
        }
    }

    test ("Lists are immutable") {
        val a = List(1,3,5,7,9)
        val b = a.remove(v => v == 5) // remove where value is 5
        
        a should equal (List(1,3,5,7,9))
        b should equal (List(1,3,7,9))
    }

    test ("Lists have many useful methods") {
        val a = List(1,3,5,7,9)
        a.length should equal (5)
        a.reverse should equal (List(9,7,5,3,1))
        a.toString should equal ("List(1, 3, 5, 7, 9)")
        a.map { v => v * 2} should equal (List(2,6,10,14,18))
        a.filter { v => v % 3 == 0 } should equal (List(3,9))
    }

    test ("Functions over lists can use _ as shorthand") {
        val a = List(1,2,3)
        a.map { _ * 2 } should equal (List(2,4,6))
        a.filter { _ % 2 == 0} should equal (List(2))
    }

    test ("Functions over lists can use () instead of {}") {
        val a = List(1,2,3)
        a.map ( _ * 2 ) should equal (List(2,4,6))
        a.filter ( _ % 2 != 0 ) should equal (List(1,3))
    }

    test ("Lists can be 'reduced' with a mathematical operation") {
        val a = List(1,3,5,7)
        // note the two _s below indicate the first and second args respectively
        a.reduceLeft( _ + _ ) should equal (16)
        a.reduceLeft( _ * _ ) should equal (105)
    }

    test ("Foldleft is like reduce, but with an explicit starting value") {
        val a = List(1,3,5,7)
        // foldLeft uses a form called currying that we will explore later
        a.foldLeft(0)( _ + _ ) should equal (16)
        a.foldLeft(10)( _ + _ ) should equal (26)
        a.foldLeft(1)( _ * _ ) should equal (105)
        a.foldLeft(0)( _ * _ ) should equal (0)
    }
}
