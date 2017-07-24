package ADT
import scala.reflect.ClassTag
class stack[T:ClassTag] extends traitstack[T] {
  /*we make the use of array to store
   * 
   */
  private var n=20
  private var arr=new Array[T](n)
  private var top=0
  def isEmpty: Boolean = top==0
  def peek: T =arr(top-1)
  def pop(): T ={
    top-=1
    arr(top)
  }
  def push(a: T)={
    if(top<=n-1){
   //if we want to extends the size 
      //create another new array copy all elements using Array.copy
      
    arr(top)=a
     top+=1
    }
  else{
    println("array is full to add elements")
  }
  }
  
  
}