package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object billiard {
  def main(args: Array[String]): Unit = {
    while (true) {
      val line = StdIn.readLine.split(' ').map(_.toDouble).toSeq

      if (line == Seq(0, 0, 0, 0, 0))
        return

      val Seq(a, b, s, m, n) = line

      val xDist = a * m
      val yDist = b * n

      val angle = if (xDist == 0) 90 else math.atan2(yDist, xDist).toDegrees
      val totalDist = math.sqrt(math.pow(xDist, 2) + math.pow(yDist, 2))

      printf("%.02f %.02f", angle, totalDist / s.toDouble)
    }
  }
}
