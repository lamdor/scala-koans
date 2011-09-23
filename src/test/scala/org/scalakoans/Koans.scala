package org.scalakoans

import org.scalatest._
import support.Master

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
	new AboutFunctions,
	new AboutLists,
	new AboutSequencesAndArrays
  )

  override def run(testName: Option[String], reporter: Reporter, stopper: Stopper, filter: Filter,
                   configMap: Map[String, Any], distributor: Option[Distributor], tracker: Tracker) {
    super.run(testName, reporter, Master, filter, configMap, distributor, tracker)
  }

}
