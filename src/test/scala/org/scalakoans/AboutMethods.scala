package org.scalakoans

import support.KoanSuite

class AboutMethods extends KoanSuite {

  koan ("method declaration") {
    def add2(i: Int): Int = {
      return i + 2
    }

    add2(2) should __
  }

  koan ("return not always necssary") {
    def add2(i: Int): Int = {
      i + 2
    }

    add2(3) should __
  }

  koan ("return type necessity") {
    def add2(i: Int) = {
      i + 2
    }

    add2(4) should __
  }

  koan ("nested methods") {

    def add2(i: Int) = {
      def add(x: Int, y: Int) = {
        x + y
      }

      add(2, i)
    }

    add2(5) should __

    meditate
    // add3(2) should be(5)
  }

  koan ("method with a return") {
    var x = 2
    def add2ToX() {
      x = x + 2
    }

    add2ToX()

    x should __
  }

  koan ("method body") {
    def add2(i: Int) = i + 2

    add2(2) should __
  }
}
