package com.jcranky.scala99

import org.specs2.mutable.Specification

/**
 * P12 (**) Decode a run-length encoded list.
 * 
 * @author kubiczek
 */
class Problem12Spec extends Specification {
  "test compress list" should {
    
    "return List()" in {
      "when given List()" in {
        "with the unzip() implementation" in {
          Problem12.decode(List()) must_== List()
        }
      }
    }
    
    val result = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
    "return %s".format(result) in {
      val list1 = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
      "when given %s".format(list1) in {
        "with the unzip() implementation" in {
          Problem12.decode(list1) must_== result
        }
      }
    }
  }
}