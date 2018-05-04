package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object bijele {
  val correctPieces = List(1, 1, 2, 2, 2, 8)

  def main(args: Array[String]): Unit = {
    val pieces = StdIn.readLine.split(' ').map(_.toInt).toList

    val diff = correctPieces.zip(pieces).map(tuple => tuple._1 - tuple._2)

    println(diff.mkString(" "))
  }
}
