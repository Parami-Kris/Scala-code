package currencyConversion {
  class Currency {
    def toINR(amount: Double, currency: String): Double = currency match {
      case "Dollar" => amount * 74.0
      case "Euro"   => amount * 86.0
      case "Yen"    => amount * 0.68
    }
    def fromINR(amount: Double, currency: String): Double = currency match {
      case "Dollar" => amount / 74.0
      case "Euro"   => amount / 86.0
      case "Yen"    => amount / 0.68
    }
  }
}

package distanceConversion {
  class Distance {
    def meterToKm(meters: Double): Double = meters / 1000
    def kmToMeter(kms: Double): Double = kms * 1000
    def milesToKm(miles: Double): Double = miles * 1.609
    def kmToMiles(kms: Double): Double = kms / 1.609
  }
}

package timeConversion {
  class Timer {
    def hoursToMinutes(hours: Int): Int = hours * 60
    def hoursToSeconds(hours: Int): Int = hours * 3600
    def minutesToHours(minutes: Int): Double = minutes / 60.0
    def secondsToHours(seconds: Int): Double = seconds / 3600.0
  }
}

object Converter extends App {
  import currencyConversion._
  import distanceConversion._
  import timeConversion._

  val currency = new Currency
  val distance = new Distance
  val timer = new Timer

  println(s"Dollar to INR: ${currency.toINR(10, "Dollar")}")
  println(s"10 KM to Miles: ${distance.kmToMiles(10)}")
  println(s"2 Hours to Seconds: ${timer.hoursToSeconds(2)}")
}
