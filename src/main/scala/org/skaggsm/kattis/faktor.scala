package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/22/2018.
  */
object faktor {
  def main(args: Array[String]): Unit = {
    val (a +: i +: _) = StdIn.readLine().split(' ').map(_.toInt).toSeq

    println(a * (i - 1) + 1)
  }
}
