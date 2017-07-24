package searching

class allSearch {
  
  //finding the index of an element
  def linearsearch(arr:Array[Int],c :Int):Int={
    var i=0
    while(i<arr.length && c!=arr(i))i+=1
    if(i<arr.length)i else -1
   }
  
  }