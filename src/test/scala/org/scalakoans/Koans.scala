package org.scalakoans

import org.scalatest._

class Koans extends Suite {
  override def nestedSuites = List(
    new AboutAsserts,
    new AboutValAndVar,
    new AboutLiterals,
    new AboutTuples,
    new AboutMethods,
    new AboutClasses,
    new AboutObjects,
    new AboutPackages,
    new AboutAbstractClasses,
    new AboutStructuralTypes,
    new AboutTraits,
    new AboutEmptyValues,
    new AboutFunctions
  )
}
