import scala.io.StdIn.{readLine, readInt}
import scala.sys.process.processInternal
object ebBill{
val domestic = Array(1.0, 2.5, 4.0, 6.0);
val commercial = Array(2.0, 4.5, 6.0, 7.0);

class Consumer(id: String, name: String, consumerType: String) {
    var previousMonth = 0;
    var currentMonth = 0;
    def calc(): Double = {
        val totalUsage = currentMonth - previousMonth;
        return _calc(totalUsage);
    }
    def _calc(totalUsage: Int): Double = {
        if (totalUsage <= 100)
            return totalUsage * (if (consumerType == "domestic") domestic(0) else commercial(0))
        else if (totalUsage <= 200)
            return totalUsage * (if (consumerType == "domestic") domestic(1) else commercial(1));
        else if (totalUsage <= 500)
            return totalUsage * (if (consumerType == "domestic") domestic(2) else commercial(2));
        else
            return totalUsage* (if (consumerType == "domestic")domestic(3) else commercial(3));
    }
    def getData() = {
        println("Kindly enter previous month reading.");
        previousMonth = readInt();
        println("Kindly enter current month reading.");
        currentMonth = readInt();
    }
    def display(total: Double) = {
        println("GENERATED BILL");
        println("---------------------");
        println(s"Name:\t$name#$id");
        println(s"Usage:\t$consumerType (${currentMonth - previousMonth} units)");
        println(s"Amount to be paid:\t$total");
    }
}

def main(Args:Array[String]) {
    println("Welcome!");
    println("Kindly enter consumer name.");
    val consumerName: String = readLine();
    println("Kindly enter consumer ID.");
    val consumerID: String = readLine();
    println("Kindly enter consumer type (domestic / commercial).");
    val consumerType: String = readLine();
    if (consumerType != "domestic" && consumerType != "commercial") {
        println("Consumer type can only be domestic / commercial.");
        sys.exit(1);}
    val consumer = new Consumer(consumerID, consumerName, consumerType);
    consumer.getData();
    val total = consumer.calc();
    consumer.display(total);
}
}
