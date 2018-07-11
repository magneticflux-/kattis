package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/9/2018.
  */
object falsesecurity {

  val morse: Seq[(Char, String)] = Seq(
    'A' -> ".-",
    'B' -> "-...",
    'C' -> "-.-.",
    'D' -> "-..",
    'E' -> ".",
    'F' -> "..-.",
    'G' -> "--.",
    'H' -> "....",
    'I' -> "..",
    'J' -> ".---",
    'K' -> "-.-",
    'L' -> ".-..",
    'M' -> "--",
    'N' -> "-.",
    'O' -> "---",
    'P' -> ".--.",
    'Q' -> "--.-",
    'R' -> ".-.",
    'S' -> "...",
    'T' -> "-",
    'U' -> "..-",
    'V' -> "...-",
    'W' -> ".--",
    'X' -> "-..-",
    'Y' -> "-.--",
    'Z' -> "--..",
    '_' -> "..--",
    ',' -> ".-.-",
    '.' -> "---.",
    '?' -> "----"
  )

  val asciiToMorse: Map[Char, String] = morse.toMap

  val morseToAscii: Map[String, Char] = morse.map(_.swap).toMap

  def main(args: Array[String]): Unit = {
    Stream.continually(StdIn.readLine)
      .takeWhile(s => s != null && s != "")
      .map(line => {
        val morseVersion = line.seq.map(asciiToMorse)
        val lengths = morseVersion.map(_.length)
        val reversedLengths = lengths.reverse

        val morseToDecode = morseVersion.flatten.mkString

        var remainingMorseToDecode = morseToDecode

        val decoded = reversedLengths.map(l => {
          val (first, second) = remainingMorseToDecode.splitAt(l)
          remainingMorseToDecode = second

          morseToAscii(first)
        })

        decoded.mkString
      })
      .foreach(println)
  }
}
