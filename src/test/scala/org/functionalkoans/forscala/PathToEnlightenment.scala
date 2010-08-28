package org.functionalkoans.forscala
import org.scalatest.Suite
import org.scalatest.junit.JUnitRunner
import org.junit.runner.RunWith

@RunWith(classOf[JUnitRunner])
class PathToEnlightenmentTest extends Suite {
  override def nestedSuites = List(new AboutAsserts,
                                   new AboutValAndVar,
                                   new AboutEmptyValues,
                                   new AboutLists,
                                   new AboutSequencesAndArrays)
}
