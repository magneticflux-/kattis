package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/12/2018.
  */
object jewelrybox {
  def main(args: Array[String]): Unit = {
    val cases = StdIn.readInt

    Stream.continually(StdIn.readLine)
      .take(cases)
      .foreach(s => {
        val Array(w, l) = s.split(' ').map(_.toInt)

        // Zeros of derivative of volume in terms of h:
        // h = 1/6 (±sqrt(l^2 - l w + w^2) + l + w)
        // Only need first one (-)
        val h = (1 / 6d) * (w + l - math.sqrt((l * l) - l * w + (w * w)))

        val v = h * (w - 2 * h) * (l - 2 * h)

        println(v)
      })
  }
}
