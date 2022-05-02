package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object pot {
  def main(args: Array[String]): Unit = {
    val count = StdIn.readInt()

    println(
      (0 until count)
        .map(_ => StdIn.readLine())
        .map(s => BigInt(s.init).pow(s.last.asDigit))
        .sum
    )
  }
}
