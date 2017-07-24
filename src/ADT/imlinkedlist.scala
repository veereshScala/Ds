package ADT
sealed trait xList[+T]
case class cons[T](val head:T,val tail:xList[T]) extends xList[T]
case object myNil extends xList[Nothing]
//val xs=cons(1,myNil)
//instead of sealted trait we can make an abstract class and do the same 
/*
sealed abstract xList[+T]{
* def head:T
* def tail:xList[T]
* }
* next is to create the MYnil which has to point to the end od list 
* case object myNil extends xList[Nothing]={
* def head= throw new NoSuchElementException(mNil.head)
* def tail =throw new NosuchElementException(myNil.tail)
* }
* define a new empty list first and then keep adding elements to it 
* case class myCons[T](head:T,tail:xList[T]) extends xList[T]
*/
