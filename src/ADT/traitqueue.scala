package ADT

trait traitqueue[T] {
  /*D.S FIFO
   * enquque add elements
   * dequeue delete elements
   * isempty to test queue is not empty 
   */
  def enqueue(a:T):Unit
  def dequeue():T
  def isEmpty:Boolean
  def peek:T
  
}