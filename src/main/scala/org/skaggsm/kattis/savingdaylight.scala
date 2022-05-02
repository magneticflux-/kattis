package org.skaggsm.kattis

import scala.io.StdIn
import scala.util.matching.Regex

/**
  * Created by Mitchell Skaggs on 7/29/2018.
  */
object savingdaylight {

  val dateTimePattern: Regex = """(\w+ \d+ \d+) (\d+):(\d+) (\d+):(\d+)""".r

  def main(args: Array[String]): Unit = {
    LazyList.continually[String](StdIn.readLine())
      .takeWhile(s => s != null && s.nonEmpty)
      .map {
        case dateTimePattern(date, startH, startM, endH, endM) =>
          val totalMinutes = (endH.toInt - startH.toInt) * 60 + (endM.toInt - startM.toInt)

          s"$date ${totalMinutes / 60} hours ${totalMinutes % 60} minutes"
      }
      .foreach(println)
  }
}
