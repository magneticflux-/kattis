package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/23/2018.
  */
object karte {
  def main(args: Array[String]): Unit = {
    val cards = StdIn.readLine().grouped(3).toList

    if (cards.size != cards.distinct.size)
      println("GRESKA")
    else {
      val suits = cards.groupBy(_ (0)).mapValues(13 - _.size).withDefaultValue(13)

      println(s"${suits('P')} ${suits('K')} ${suits('H')} ${suits('T')}")
    }
  }
}
