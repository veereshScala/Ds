package ListBased

class Lsorting {
  //Bubble sort 
def bubbleSort(lst:List[Int]):List[Int]={
    //tIntke two list inpit lst Intnd destinInttion list ds
    def sort(inp:List[Int],ds:List[Int]):List[Int]= inp match {
      case Nil=>ds
      case _=>bubble(inp,Nil,ds)
      
     // if(inp.isEmpty)ds
      //else bubble(inp,Nil,ds)//here inp is source nil is the temp list Intnd ds is the destinInttionlist
      }
    def bubble(soruce:List[Int],temp:List[Int],ds:List[Int]):List[Int]=soruce match{
      case h1::h2::t=> 
                          if(h2<h1)bubble(h1::t,h2::temp,ds)
                            else bubble(h2::t,h1::temp,ds)
      case h1::t=>sort(temp,h1::ds)
    }
    sort(lst,Nil)
  }
  
  //selection sort
def selectionSort(lst:List[Int]):List[Int]={
  
  def sort(inp:List[Int],ds:List[Int]):List[Int]=inp match{
    case Nil=>ds
    case h::t=>select(h,t,Nil,ds)
  }
  def select(ele:Int,src:List[Int],tmp:List[Int],dest:List[Int]):List[Int]=src match{
    case h::t=>
                if(h<ele)select(ele,t,h::tmp,dest)
                else select(h,t,ele::tmp,dest)
    case Nil=>sort(tmp,ele::dest)
  }
  sort(lst,Nil)
}
  
  
  
  
  
  //insertion sorting in list 
  def insSortLst(lst:List[Int]):List[Int]={
    //write a helper function to insert a value into a list 
    //assumption is there is a sorted list available and insert elements into the list 
    def insert(x:Int,sorted:List[Int]):List[Int]=sorted match{
      case Nil=>x::Nil
      case h::t=>if(x<h) x::sorted else h::insert(x,t)
    }
    //to compansate the for loop design a helper function 
    def helper(sorted:List[Int],unsorted:List[Int]):List[Int]=unsorted match{
      case Nil=>sorted
      case h::tail=>helper(insert(h,sorted),tail)
    }
    helper(Nil,lst)
    
  }
  
  //merge sort 
  /*implement the divide and conquor using the recurision and additional branching 
   * 
   */
  def mergesort(lst:List[Int]):List[Int]={
  def merge(l1:List[Int],l2:List[Int]):List[Int]=(l1,l2) match{
    case (Nil,_)=>l2
    case (_,Nil)=>l1
    case(h1::t1,h2::t2)=>if(h1<h2) h1::merge(t1,l2)
                          else h2::merge(l1,t2)
  }
  def msort(lst:List[Int]):List[Int]=lst match{
    case Nil=>lst
    case h::Nil=>lst
    case _=>val (l1,l2)=lst.splitAt(lst.length/2)
                        merge(msort(l1),msort(l2))
  
  
  }
  msort(lst)
  }

  //quick sort 
  //we create a pivot and then 
  def quicksort(lst:List[Int]):List[Int]=lst match{
    case Nil=>lst
    case h::Nil=>lst
    case x::xs=>
      val (l1,l2)=xs.partition(_<x)
        quicksort(l1)++(x::quicksort(l2))
  }
  
  
  
  
}