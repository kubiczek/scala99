package com.jcranky.scala99

import org.specs2.mutable.Specification

/**
 * P07 (**) Flatten a nested list structure.
 * 
 * @author kubiczek
 */
class Problem07Spec extends Specification {
  "test flatten list" should {
    
    "return List() with the pattern matching implementation" in {
      "when given List()" in {
    	  Problem07.flattenPatternMatching(List()) must_== List()
      }
      "when given List(List())" in {
    	  Problem07.flattenPatternMatching(List(List())) must_== List()
      }
    }
    
    val result = List(1, 1, 2, 3, 5, 8)
    "return %s with the pattern matching implementation".format(result) in {
      val list1 = List(List(1, 1), 2, List(3, List(5, 8)))
      "when given %s".format(list1) in {
          Problem07.flattenPatternMatching(list1) must_== result
      }
      val list2 = List(List(1, 1), 2, List(), List(3, List(5, 8)))
      "when given %s".format(list2) in {
          Problem07.flattenPatternMatching(list2) must_== result
      }
    }
  }
}