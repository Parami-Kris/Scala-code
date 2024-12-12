class Employee(val name: String, val empId: Int, val address: String, val mailId: String, val mobileNo: String, val basicPay: Double) {
  def calculateSalary(): Unit = {
    val da = 0.97 * basicPay
    val hra = 0.1 * basicPay
    val pf = 0.12 * basicPay
    val club = 0.001 * basicPay
    val grossPay = basicPay + da + hra
    val netPay = grossPay - (pf + club)

    println(f"Basic Pay: Rs. $basicPay%.2f")
    println(f"DA: Rs. $da%.2f")
    println(f"HRA: Rs. $hra%.2f")
    println(f"PF: Rs. $pf%.2f")
    println(f"Club Fund: Rs. $club%.2f")
    println(f"Gross Pay: Rs. $grossPay%.2f")
    println(f"Net Pay: Rs. $netPay%.2f")
  }
}

object Main extends App {
  val emp = new Employee("Arun K", 5002, "12, Anna Nagar, Chennai-65", "arun007@gmail.com", "9876543210", 20000.0)
  emp.calculateSalary()
}
