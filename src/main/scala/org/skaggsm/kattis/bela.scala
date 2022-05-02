package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 4/24/2018.
  */
object bela {
  /**
    * (number, isDominant) -> score
    */
  private val scores = Map(
    ('A', true) -> 11,
    ('A', false) -> 11,
    ('K', true) -> 4,
    ('K', false) -> 4,
    ('Q', true) -> 3,
    ('Q', false) -> 3,
    ('J', true) -> 20,
    ('J', false) -> 2,
    ('T', true) -> 10,
    ('T', false) -> 10,
    ('9', true) -> 14,
    ('9', false) -> 0,
    ('8', true) -> 0,
    ('8', false) -> 0,
    ('7', true) -> 0,
    ('7', false) -> 0
  )

  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine().split(' ')
    val (hands, suit) = (line(0).toInt, line(1).head)

    val sum = (0 until hands * 4)
      .map(_ => StdIn.readLine())
      .map(s => (s(0), s(1)))
      .map(p => scores(p._1, p._2 == suit))
      .sum

    println(sum)
  }
}
