object TriplicateElements extends App {
  def triplicateList(inputList: List[Int]): List[Int] = {
    inputList.flatMap(element => List(element, element, element))
  }

  val originalList = List(1, 2, 3, 3, 4, 5, 6, 7)
  println("Original List: " + originalList)
  val triplicatedList = triplicateList(originalList)
  println("Triplicated List: " + triplicatedList)
}
