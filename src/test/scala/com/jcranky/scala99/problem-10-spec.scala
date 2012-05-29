package com.jcranky.scala99

import org.specs2.mutable.Specification

/**
 * P10 (*) Run-length encoding of a list.
 * 
 * @author kubiczek
 */
class Problem10Spec extends Specification {
  "test encode list" should {
    
    "return List() with the pack() implementation" in {
      "when given List()" in {
    	  Problem10.encode(List()) must_== List()
      }
    }
    
    val result = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
    "return %s with the pack() implementation".format(result) in {
      val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      "when given %s".format(list1) in {
          Problem10.encode(list1) must_== result
      }
    }
  }
}