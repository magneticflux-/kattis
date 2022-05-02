package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object numberfun {
  private val operators = Seq(
    (x: Double, y: Double) => x + y,
    (x: Double, y: Double) => x - y,
    (x: Double, y: Double) => x * y,
    (x: Double, y: Double) => x / y
  )

  def main(args: Array[String]): Unit = {
    val numCases = StdIn.readInt()

    (0 until numCases).foreach(_ => {
      val Array(a, b, c) = StdIn.readLine().split(' ').map(_.toDouble)
      val possibilities = for (
        pair <- Seq((a, b), (b, a));
        op <- operators
      )
        yield op(pair._1, pair._2)

      if (possibilities.contains(c))
        println("Possible")
      else
        println("Impossible")
    })
  }
}
