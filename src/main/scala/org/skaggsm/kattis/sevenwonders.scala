package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/4/2018.
  */
object sevenwonders {
  def main(args: Array[String]): Unit = {
    val cardTypes = Set('T', 'C', 'G')
    val cards = StdIn.readLine().groupBy(c => c).view.mapValues(_.length).toMap.withDefaultValue(0)

    println(cards.values.map(i => i * i).sum + cardTypes.map(cards(_)).min * 7)
  }
}
