package org.skaggsm.kattis

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object eligibility {
  final val DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy/MM/dd")

  def main(args: Array[String]): Unit = {
    val numContestants = StdIn.readInt()

    Iterator.continually(StdIn.readLine())
      .take(numContestants)
      .map(line => {
        val Array(name, studyDateString, birthDateString, courseNumberString) = line.split(' ')

        val studyDate = DATE_FORMATTER.parse[LocalDate](studyDateString, LocalDate.from _)
        val birthDate = DATE_FORMATTER.parse[LocalDate](birthDateString, LocalDate.from _)
        val courses = courseNumberString.toInt

        val action =
          if (studyDate.getYear >= 2010 || birthDate.getYear >= 1991) "eligible"
          else if (courses > 40) "ineligible"
          else "coach petitions"

        s"$name $action"
      })
      .foreach(println)
  }
}
