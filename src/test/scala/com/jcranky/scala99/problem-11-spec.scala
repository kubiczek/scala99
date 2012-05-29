package com.jcranky.scala99

import org.specs2.mutable.Specification

/**
 * P11 (*) Modified run-length encoding.
 * 
 * @author kubiczek
 */
class Problem11Spec extends Specification {
  "test compress list" should {
    
    "return List()" in {
      "when given List()" in {
        "with the P09 implementation" in {
          Problem11.encodeModifiedP09(List()) must_== List()
        }
    	"with the P10 implementation" in {
          Problem11.encodeModifiedP10(List()) must_== List()
        }
      }
    }
    
    val result = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
    "return %s".format(result) in {
      val list1 = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
      "when given %s".format(list1) in {
        "with the P09 implementation" in {
          Problem11.encodeModifiedP09(list1) must_== result
        }
        "with the P10 implementation" in {
          Problem11.encodeModifiedP10(list1) must_== result
        }
      }
    }
  }
}