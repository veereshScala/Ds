package testing
import ArrayBased.sorting
import ListBased.Lsorting
import ListBased.Lsorting

object test extends App {
  
val array=Array.fill(20)((scala.util.Random.nextInt(3000)-10).toInt)
//val array=Array(20,100,7,45)
val s=new sorting()
//s.selectionsort(array)
//s.bubblesort(array)
s.shellsort(array)
for(i<-0 to array.length-1)
  println(array(i))
 
 val list=List(23,21,35,11,224)
 val Ls=new Lsorting()
val ss=Ls.insSortLst(list)
 for(i<-ss)print(i+",")
 print("\n")
  val bubSort=Ls.bubbleSort(list)
  for(i<-bubSort)print(i+",")
print("\n")
 val selSort=Ls.selectionSort(list)
  for(i<-selSort)print(i+",")
  print("\n"+"merge sort")
  val msort=Ls.mergesort(list)
  for(i<-msort)print(i+",")
  print("\n"+"quick sort")
  val qsort=Ls.quicksort(list)
  for(i<-qsort)print(i+",")


}