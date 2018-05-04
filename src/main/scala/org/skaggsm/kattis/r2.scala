package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/22/2018.
  */
object r2 {
  def main(args: Array[String]): Unit = {
    val (r1 +: s +: _) = StdIn.readLine().split(' ').map(_.toInt).toSeq

    println(2 * s - r1)
  }
}
