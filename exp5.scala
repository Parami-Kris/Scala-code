import scala.collection.mutable.ArrayBuffer

object StringOperations extends App {
  val arrayList = ArrayBuffer[String]()
  
  def menu(): Unit = {
    println("\nSTRING MANIPULATION")
    println("1. Append at end")
    println("2. Insert at particular index")
    println("3. Search")
    println("4. List strings starting with a letter")
    println("5. Size")
    println("6. Remove")
    println("7. Sort")
    println("8. Display")
    println("9. Exit")
  }

  var choice = 0
  do {
    menu()
    print("Enter your choice: ")
    choice = scala.io.StdIn.readInt()
    choice match {
      case 1 => 
        print("Enter string to append: ")
        arrayList += scala.io.StdIn.readLine()
      case 2 => 
        print("Enter string to insert: ")
        val str = scala.io.StdIn.readLine()
        print("Enter index: ")
        val index = scala.io.StdIn.readInt()
        arrayList.insert(index, str)
      case 3 => 
        print("Enter string to search: ")
        val search = scala.io.StdIn.readLine()
        println(s"Index: ${arrayList.indexOf(search)}")
      case 4 => 
        print("Enter letter: ")
        val letter = scala.io.StdIn.readLine()
        println("Strings starting with the letter:")
        arrayList.filter(_.startsWith(letter)).foreach(println)
      case 5 => 
        println(s"Size of list: ${arrayList.size}")
      case 6 => 
        print("Enter string to remove: ")
        val remove = scala.io.StdIn.readLine()
        arrayList -= remove
      case 7 => 
        arrayList.sortInPlace()
        println("List sorted.")
      case 8 => 
        println("Current list:")
        println(arrayList.mkString(", "))
    }
  } while (choice != 9)
}
