package com.jcranky.scala99

import org.specs2.mutable.Specification

/**
 * P08 (**) Eliminate consecutive duplicates of list elements.
 * 
 * @author kubiczek
 */
class Problem08Spec extends Specification {
  "test compress list" should {
    
    "return List() with the recursive implementation" in {
      "when given List()" in {
    	  Problem08.compress(List()) must_== List()
      }
    }
    
    val result = List('a, 'b, 'c, 'a, 'd, 'e)
    "return %s with the recursive implementation".format(result) in {
      val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      "when given %s".format(list1) in {
          Problem08.compress(list1) must_== result
      }
      val list2 = List('a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'd, 'e)
      "when given %s".format(list2) in {
          Problem08.compress(list2) must_== result
      }
    }
  }
}