package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/2/2018.
  */
object anewalphabet {

  val translation: Map[Char, String] = Map(
    'a' -> "@",
    'b' -> "8",
    'c' -> "(",
    'd' -> "|)",
    'e' -> "3",
    'f' -> "#",
    'g' -> "6",
    'h' -> "[-]",
    'i' -> "|",
    'j' -> "_|",
    'k' -> "|<",
    'l' -> "1",
    'm' -> "[]\\/[]",
    'n' -> "[]\\[]",
    'o' -> "0",
    'p' -> "|D",
    'q' -> "(,)",
    'r' -> "|Z",
    's' -> "$",
    't' -> "']['",
    'u' -> "|_|",
    'v' -> "\\/",
    'w' -> "\\/\\/",
    'x' -> "}{",
    'y' -> "`/",
    'z' -> "2"
  ).withDefault(c => c.toString)

  def main(args: Array[String]): Unit = {
    val line = StdIn.readLine()

    println(line.toLowerCase.flatMap(translation(_)))
  }
}
