package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/12/2018.
  */
object chopin {

  private val equivalents = Seq(
    "A#" -> "Bb",
    "C#" -> "Db",
    "D#" -> "Eb",
    "F#" -> "Gb",
    "G#" -> "Ab",
  )

  val alternates: Map[String, String] = (equivalents ++ equivalents.map(_.swap)).toMap

  def main(args: Array[String]): Unit = {
    LazyList.continually(StdIn.readLine())
      .takeWhile(s => s != null && s.nonEmpty)
      .zipWithIndex
      .map(p => {
        val (line, index) = p

        val Array(note, tonality) = line.split(' ')

        val alternateNote = alternates.get(note)

        val alternateKey = alternateNote match {
          case Some(altNote) => s"$altNote $tonality"
          case None => "UNIQUE"
        }

        s"Case ${index + 1}: $alternateKey"
      })
      .foreach(println)
  }

}
