package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object onechicken {
  def main(args: Array[String]): Unit = {
    val Array(n, m) = StdIn.readLine().split(' ').map(_.toInt)

    val netChicken = m - n

    if (netChicken > 0)
      println(s"Dr. Chaz will have $netChicken piece${if (1 < netChicken) "s" else ""} of chicken left over!")
    else if (netChicken < 0)
      println(s"Dr. Chaz needs ${-netChicken} more piece${if (netChicken < -1) "s" else ""} of chicken!")
  }
}
