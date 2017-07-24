package ArrayBased
/*
 * This class Holds all the sorting algorithms using Arrays of Scala 
 * 
 */
class sorting {

  //Bubble sort

  def bubblesort(arr: Array[Int]) {
    for (i <- 0 until arr.length - 1) {
      for (j <- 0 until arr.length - 1 - i) {
        if (arr(j + 1) < arr(j)) {
          val temp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = temp
        }
      }
    }

  }

  //selection sort 

  def selectionsort(arr: Array[Int]) = {
    for (i <- 0 until arr.length - 1) {
      var min = i
      for (j <- i + 1 until arr.length) {
        if (arr(j) > arr(min))
          min = j
      }
      val temp = arr(i)
      arr(i) = arr(min)
      arr(min) = temp
    }
  }
  //insertion sort

  def insertionsort(arr: Array[Int]) {

    for (i <- 1 until arr.length) {
      var j = i - 1
      var temp = arr(i)
      while (j >= 0 && temp < arr(j)) {
        arr(j + 1) = arr(j)
        j -= 1
      }
      arr(j + 1) = temp
    }
  }


//shell sort or the gap sort 
  
  def shellsort(arr:Array[Int]){
    var gap=arr.length/2
    while(gap>=1)
    {
      for(i<- gap until arr.length)
      {
        var j=i-gap
        var temp=arr(i)
        while(j>=0&&temp<arr(j)){
          arr(j+gap)=arr(j)
          j-=gap
        }
        arr(j+gap)=temp
        
      }
      gap=(gap/2.2).round.toInt
    }
    
  }





}