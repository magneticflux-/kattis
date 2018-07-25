package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/25/2018.
  */
object abc {
  private final val defaultOrder = "ABC"

  def main(args: Array[String]): Unit = {
    val numbers = StdIn.readLine.split(' ').map(_.toInt)
    val ordering = StdIn.readLine

    val mapping = defaultOrder.zip(numbers.sorted).toMap

    println(ordering.map(mapping).mkString(" "))
  }
}
