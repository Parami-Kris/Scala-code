object StringHandling extends App {
  val str1 = "Dot"
  val str2 = "saw"
  val str3 = "Tod"

  // Length
  println(s"Length of the string '$str1': ${str1.length}")

  // Concatenation
  val concatenated = str1 + " " + str2 + " " + str3
  println(s"Concatenated string: $concatenated")

  // Lowercase and Uppercase
  println(s"Lowercase: ${str1.toLowerCase}")
  println(s"Uppercase: ${str1.toUpperCase}")

  // Reverse
  val reversed = str1.reverse
  println(s"Reversed string: $reversed")
}
