package ADT
import scala.reflect.ClassTag
class queue[T:ClassTag] extends traitqueue[T] {
//need to references for adding the element 
  //second for the tracing the location to make FIFO
  private var n=20
  private var arr=new Array[T](n)
  private var start=0
  private var curr=0
  
  
  def isEmpty: Boolean = start==curr
  def peek: T = arr(start)
  def dequeue: T = {
    var ref=arr(start)
    start=(start+1)%arr.length
    ref
    
  }
  def enqueue(a: T): Unit = {
    if(curr<arr.length){
    arr(curr)=a
    curr=(curr+1)%arr.length
    }
    else{
      println("queue is full")
    }
  
  }

}