package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object deathknight {
  def main(args: Array[String]): Unit = {
    val numBattles = StdIn.readInt
    println(
      (0 until numBattles)
        .map(_ => StdIn.readLine)
        .count(s => {
          !s.contains("CD")
        })
    )
  }
}
