package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/6/2018.
  */
object closingtheloop {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt()

    Iterator.continually(StdIn.readInt())
      .take(cases)
      .zipWithIndex
      .map(_._2)
      .foreach(caseNum => {
        val ropes = StdIn.readLine()
          .split(' ')
          .map(s => {
            val color = s.last match {
              case 'R' => Red
              case 'B' => Blue
            }

            val length = s.init.toInt

            Segment(length, color)
          })
          .toSeq

        val redRope = ropes.filter(_.color == Red).sortBy(_.length).reverse
        val blueRope = ropes.filter(_.color == Blue).sortBy(_.length).reverse

        val pairs = redRope.zip(blueRope).flatMap(p => Seq(p._1, p._2))

        val length = pairs.map(_.length).sum - pairs.length

        println(s"Case #${caseNum + 1}: $length")
      })
  }

  sealed trait Color

  case class Segment(length: Int, color: Color)

  case object Red extends Color

  case object Blue extends Color

}
