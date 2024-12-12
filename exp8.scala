class NegativeAmtException(message: String) extends Exception(message)

object UserDefinedException extends App {
  try {
    print("Enter amount: ")
    val amount = scala.io.StdIn.readInt()
    if (amount < 0) {
      throw new NegativeAmtException("Invalid amount")
    } else {
      println("Amount deposited")
    }
  } catch {
    case e: NegativeAmtException => println(e.getMessage)
  }
}
