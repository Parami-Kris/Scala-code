object SegregateEvenOdd extends App {
  def segregateEvenOdd(arr: Array[Int]): Array[Int] = {
    val even = arr.filter(_ % 2 == 0)
    val odd = arr.filter(_ % 2 != 0)
    even ++ odd
  }

  val arr = Array(20, 12, 23, 17, 7, 8, 10, 2, 1)
  println("Original Array: " + arr.mkString(", "))
  val result = segregateEvenOdd(arr)
  println("Array after segregating even and odd: " + result.mkString(", "))
}
