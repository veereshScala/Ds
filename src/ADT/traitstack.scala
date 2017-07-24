package ADT

trait traitstack[T] {
  /*operations of stack 
  push--add element 
  pop delete a particular element D.S LIFO
  peek look at the last element
  isEmpty
  */
  def push(a:T):Unit
  def pop():T
  def peek:T
  def isEmpty:Boolean
  
}