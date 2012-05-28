package com.jcranky.scala99

/**
 * P07 (**) Flatten a nested list structure.
 * Example:
 * 
 * scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
 * res0: List[Any] = List(1, 1, 2, 3, 5, 8)
 * 
 * @author kubiczek
 */
object Problem07 {
  def flattenPatternMatching(list: List[Any]): List[Any] = list match {
    case (head@_::_)::tail => flattenPatternMatching(head) ++ flattenPatternMatching(tail)
    case Nil::tail => flattenPatternMatching(tail)
    case head::tail => head :: flattenPatternMatching(tail)
    case Nil => Nil
  }
  
}
