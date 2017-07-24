package ADT

trait listadt[T] {
 //getting an element is calledd apply method
  //set is the update data
  def apply(index:Int):T
  def update(index :Int,data:T)
  def insert(index:Int,data:T)
  def remove(index:Int):T
}