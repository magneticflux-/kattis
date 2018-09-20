package org.skaggsm.kattis

import scala.collection.mutable
import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 9/19/2018.
  */
object conversationlog {
  def main(args: Array[String]): Unit = {
    val lines = StdIn.readInt()

    val wordsUsed = mutable.Map[String, Int]().withDefaultValue(0)
    val wordsByUser = mutable.Map[String, mutable.Set[String]]()

    Stream.fill(lines)(StdIn.readLine())
      .foreach(line => {
        val words = line.split(' ')
        val userSet = wordsByUser.getOrElseUpdate(words.head, mutable.Set[String]())

        for (word <- words.tail) {
          userSet += word
          wordsUsed(word) = wordsUsed(word) + 1
        }
      })

    val wordsFromAllUsers = wordsByUser.values.toStream.reduce((i, j) => i & j)

    val sortedWords = wordsUsed.toSeq
      .filter(i => wordsFromAllUsers.contains(i._1))
      .sortWith((first, second) => {
        val firstOrder = first._2.compareTo(second._2)
        if (firstOrder != 0)
          firstOrder > 0
        else
          first._1.compareTo(second._1) < 0
      })

    if (sortedWords.nonEmpty)
      sortedWords.foreach(i => println(i._1))
    else
      println("ALL CLEAR")
  }
}
