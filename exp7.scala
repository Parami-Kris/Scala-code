object BuiltInExceptions extends App {
  try {
    val num = "abc".toInt // NumberFormatException
  } catch {
    case _: NumberFormatException => println("Caught NumberFormatException")
  }

  try {
    val arr = Array(1, 2, 3)
    println(arr(5)) // ArrayIndexOutOfBoundsException
  } catch {
    case _: ArrayIndexOutOfBoundsException => println("Caught ArrayIndexOutOfBoundsException")
  }

  try {
    val arr = new Array[Int](-5) // NegativeArraySizeException
  } catch {
    case _: NegativeArraySizeException => println("Caught NegativeArraySizeException")
  }

  try {
    val result = 10 / 0 // ArithmeticException
  } catch {
    case _: ArithmeticException => println("Caught ArithmeticException")
  }
}
