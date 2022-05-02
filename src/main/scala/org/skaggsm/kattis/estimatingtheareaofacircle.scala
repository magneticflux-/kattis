package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object estimatingtheareaofacircle {
  def main(args: Array[String]): Unit = {
    var line = StdIn.readLine()

    while (line != null && line != "0 0 0") {

      val Array(r, m, c) = line.split(' ').map(_.toDouble)

      println(s"${math.Pi * math.pow(r, 2)} ${4 * math.pow(r, 2) * c / m}")

      line = StdIn.readLine()
    }
  }
}
