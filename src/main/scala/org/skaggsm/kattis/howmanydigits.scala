package org.skaggsm.kattis

import scala.io.StdIn


/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object howmanydigits {

  val logs: Array[Double] = (0 to 5).map(i => math.log10(i)).toArray

  def main(args: Array[String]): Unit = {

    var line = StdIn.readLine()
    while (line != "" && line != null) {

      val i = line.toInt

      val result = if (i <= 5)
        (1 to i).map(logs(_)).sum
      else {
        // Convert log value to Gamma function value
        val n = i + 1
        // Approximation for the Gamma function
        ((n - .5) * math.log(n) - n + 0.5 * math.log(2 * math.Pi)) / math.log(10)
      }
      println(result.floor.round + 1)

      line = StdIn.readLine()
    }
  }
}
