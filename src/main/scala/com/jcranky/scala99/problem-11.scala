package com.jcranky.scala99

/**
 * P11 (*) Modified run-length encoding.
 * Modify the result of problem P10 in such a way that if an element 
 * has no duplicates it is simply copied into the result list. 
 * Only elements with duplicates are transferred as (N, E) terms. 
 * 
 * Example:
 * scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
 * res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
 * 
 * @author kubiczek
 */
object Problem11 {
  def encodeModifiedP09[T](list: List[T]): List[Any] = Problem09.pack(list).map(
      xs => if(xs.length==1) xs.head else (xs.length, xs.head))
  
  def encodeModifiedP10[T](list: List[T]): List[Any] = Problem10.encode(list).map(
      elem => if(elem._1==1) elem._2 else elem)
}
