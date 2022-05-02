package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/2/2018.
  */
object mjehuric {
  def main(args: Array[String]): Unit = {
    var list = StdIn.readLine().split(' ').map(_.toInt) match {
      case Array(a, b, c, d, e) => (a, b, c, d, e)
    }

    do {
      list = list match {
        case (a, b, c, d, e) if a > b =>
          val result = (b, a, c, d, e)
          println(result.productIterator.mkString(" "))
          result
        case _ => list
      }

      list = list match {
        case (a, b, c, d, e) if b > c =>
          val result = (a, c, b, d, e)
          println(result.productIterator.mkString(" "))
          result
        case _ => list
      }

      list = list match {
        case (a, b, c, d, e) if c > d =>
          val result = (a, b, d, c, e)
          println(result.productIterator.mkString(" "))
          result
        case _ => list
      }

      list = list match {
        case (a, b, c, d, e) if d > e =>
          val result = (a, b, c, e, d)
          println(result.productIterator.mkString(" "))
          result
        case _ => list
      }
    }
    while (list != (1, 2, 3, 4, 5))
  }
}
