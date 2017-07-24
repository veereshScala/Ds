package ADT
//this is mutable linked list 
class Linkedlist[T] extends listadt[T] {

  //define the nodes for simplicity 
  private class Node(var data:T,var next:Node)
  private var head:Node=null
  //write the apply method go through the list and get the index
  def apply(index: Int): T = {
    require(index >=0)
    //declare a pounter 
    var pointer=head
    for(i<- 0 until index)
      pointer=pointer.next
      pointer.data
    
  }
  def insert(index: Int,data: T) = {
    require(index>=0)
    if(index==0)
    {  
      head=new Node(data,head)
      }
    else{
      var pointer=head
      for(i<- 0 until index-1)
        pointer=pointer.next
       pointer.next= new Node(data,pointer.next)
      
    }
    
  }
  def remove(index: Int): T ={
    require(index>=0)
    if(index==0)
      {val rem=head.data
      head=head.next
      rem}
    else{
     var pointer=head
      for(i<- 0 until index) pointer=pointer.next
      val rem=pointer.next.data
      pointer.next=pointer.next.next
      rem
    }
  }
  def update(index: Int,data: T): Unit ={
    require(index >=0)
    var pointer=head
    for(i<- 0 until index)
      pointer.data=data
  }

  
  
}