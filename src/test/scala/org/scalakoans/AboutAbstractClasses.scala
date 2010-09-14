package org.scalakoans

import support.KoanSuite

class AboutAbstractClasses extends KoanSuite {

  koan ("Abstract Classes") {
    abstract class Super {
      def sayHello(name: String): String
    }

    class Thing extends Super {
      def sayHello(name: String) = "Hello " + name
    }

    (new Thing).sayHello("Lou") should be(__)

    meditate
    // class Thing2 extends Super {
    // }
  }

}
