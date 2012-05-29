package com.jcranky.scala99

import org.specs2.mutable.Specification

/**
 * P09 (**) Pack consecutive duplicates of list elements into sublists.
 * 
 * @author kubiczek
 */
class Problem09Spec extends Specification {
  "test compress list" should {
    
    "return List() with the recursive implementation" in {
      "when given List()" in {
    	  Problem09.pack(List()) must_== List()
      }
    }
    
    val result = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
    "return %s with the recursive implementation".format(result) in {
      val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      "when given %s".format(list1) in {
          Problem09.pack(list1) must_== result
      }
    }
  }
}