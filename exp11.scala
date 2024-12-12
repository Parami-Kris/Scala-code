object ExceptionHandlingDemo extends App {
  try {
    val result = 10 / 0 // ArithmeticException
  } catch {
    case _: ArithmeticException => println("Caught ArithmeticException")
  } finally {
    println("Finally block executed")
  }

  try {
    val str: String = null
    println(str.length) // NullPointerException
  } catch {
    case _: NullPointerException => println("Caught NullPointerException")
  }

  try {
    throw new Exception("Custom Exception") // Throw keyword demonstration
  } catch {
    case e: Exception => println(s"Caught Exception: ${e.getMessage}")
  }
}
