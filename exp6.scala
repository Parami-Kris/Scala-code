abstract class Shape {
  def calculateArea(): Double
}

class Rectangle(val length: Double, val breadth: Double) extends Shape {
  override def calculateArea(): Double = length * breadth
}

class Circle(val radius: Double) extends Shape {
  override def calculateArea(): Double = Math.PI * radius * radius
}

class Triangle(val base: Double, val height: Double) extends Shape {
  override def calculateArea(): Double = 0.5 * base * height
}

object Main extends App {
  val rect = new Rectangle(2, 3)
  val circle = new Circle(4)
  val triangle = new Triangle(5, 6)

  println(s"Area of Rectangle: ${rect.calculateArea()}")
  println(s"Area of Circle: ${circle.calculateArea()}")
  println(s"Area of Triangle: ${triangle.calculateArea()}")
}
