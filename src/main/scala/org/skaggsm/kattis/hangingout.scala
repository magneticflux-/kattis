package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/5/2018.
  */
object hangingout {
  def main(args: Array[String]): Unit = {
    val Array(limit, numEvents) = StdIn.readLine.split(' ').map(_.toInt)

    val result = (0 until numEvents)
      .map(_ => StdIn.readLine)
      .map(s => Event(
        (if (s.substring(0, 5) == "enter") 1 else -1)
          * s.substring(6).toInt))
      .foldLeft(DeniedAndCurrent(0, 0))((deniedAndCurrent, event) => {
        if (deniedAndCurrent.current + event.netChange > limit)
          deniedAndCurrent.copy(denied = deniedAndCurrent.denied + 1)
        else
          deniedAndCurrent.copy(current = deniedAndCurrent.current + event.netChange)
      })

    println(result.denied)
  }

  case class DeniedAndCurrent(denied: Int, current: Int)

  case class Event(netChange: Int)

}
