trait StackOperations {
  def push(element: Int): Unit
  def pop(): Int
  def display(): Unit
}

class Stack(size: Int) extends StackOperations {
  private val stackArray = new Array[Int](size)
  private var top = -1

  override def push(element: Int): Unit = {
    if (top == size - 1) {
      throw new Exception("Stack Overflow")
    } else {
      top += 1
      stackArray(top) = element
      println(s"Element pushed: $element")
    }
  }

  override def pop(): Int = {
    if (top == -1) {
      throw new Exception("Stack Underflow")
    } else {
      val popped = stackArray(top)
      top -= 1
      println(s"Element popped: $popped")
      popped
    }
  }

  override def display(): Unit = {
    if (top == -1) {
      println("Stack is empty")
    } else {
      println("Stack elements are:")
      for (i <- 0 to top) {
        println(stackArray(i))
      }
    }
  }
}

object TestStack extends App {
  val stack = new Stack(5)
  stack.push(10)
  stack.push(20)
  stack.push(30)
  stack.display()
  stack.pop()
  stack.display()
}
