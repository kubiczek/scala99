package com.jcranky.scala99

/**
 * P12 (**) Decode a run-length encoded list.
 * Given a run-length code list generated as specified in problem P10, 
 * construct its uncompressed version. 
 * 
 * Example:
 * scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
 * res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
 * 
 * @author kubiczek
 */
object Problem12 {
  def decode[T](list: List[(Int, T)]): List[T] = {
    def unzip(pair: (Int, T)): List[T] = {
      pair match {
        case (1, x) => x :: Nil
        case (n, x) if n>1 => x :: unzip(n-1, x)
        case _ => throw new IllegalArgumentException
      }
    }
    
    //list.map(unzip(_)).flatten
    list.flatMap(unzip(_))
  }
 
  def decodeBuildin[T](list: List[(Int, T)]): List[T] =
    list.flatMap(x => List.make(x._1, x._2))
}
