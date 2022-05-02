package org.skaggsm.kattis

import scala.io.StdIn
import scala.math.*

/**
  * Created by Mitchell Skaggs on 7/29/2018.
  */
object triangleornaments {
  def main(args: Array[String]): Unit = {
    val numTriangles = StdIn.readInt()
    val totalSize = LazyList.fill(numTriangles)(StdIn.readLine())
      .map(_.split(' ').map(_.toDouble))
      .map {
        case Array(a, b, c) =>

          /*
          Main Triangle:
          C is on top, hanging.
          A is left.
          B is right.

          A,B,C points are unknown, only a,b,c distances are known
          AB = c, BC = a, CA = b
          Angle C = gamma

          ---

          Small Triangle:
          C is on top.
          D is left
          B is right

          BC = a, CD = ?, DB = c/2 (smallC)
          Angle DCB = smallGamma
           */

          // Inverse Law of Cosines
          val beta = acos((pow(a, 2) + pow(c, 2) - pow(b, 2)) / (2 * a * c))

          val smallC = c / 2

          // Law of Cosines
          val CD = sqrt(pow(a, 2) + pow(smallC, 2) - 2 * a * smallC * cos(beta))

          // Inverse Law of Cosines
          val smallGamma = acos((pow(CD, 2) + pow(a, 2) - pow(smallC, 2)) / (2 * CD * a))

          val angleFromHangingVerticalToC = smallGamma + beta

          // Projection of line segment at angle
          val adjustedSideLength = sin(angleFromHangingVerticalToC) * c

          adjustedSideLength
      }
      .sum

    println(totalSize)
  }
}
