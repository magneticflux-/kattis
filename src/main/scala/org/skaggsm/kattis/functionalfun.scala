package org.skaggsm.kattis

import scala.io.StdIn


/**
  * Created by Mitchell Skaggs on 4/24/2018.
  */
object functionalfun {
  def main(args: Array[String]): Unit = {
    var line = StdIn.readLine
    while (line != null && line != "") {

      val domain = line.split(' ').tail.toSet
      val codomain = StdIn.readLine.split(' ').tail.toSet

      val numRelations = StdIn.readInt

      val mappings = (0 until numRelations)
        .map(_ => StdIn.readLine)
        .map(s => {
          val Array(from, to) = s.split(" -> ")
          from -> to
        })
        .toSet

      val isNotAPartialFunction = mappings.toSeq.map(_._1).size != mappings.map(_._1).size


      val isInjective = !mappings.map(_._2).exists(s => {
        // If the number of mappings *to* s is > 1, the function isn't injective
        mappings.count(inner => inner._2 == s) > 1
      })

      val isSurjective = mappings.map(_._2) == codomain

      if (isNotAPartialFunction)
        println("not a function")
      else if (isInjective && isSurjective)
        println("bijective")
      else if (isInjective)
        println("injective")
      else if (isSurjective)
        println("surjective")
      else
        println("neither injective nor surjective")

      line = StdIn.readLine
    }
  }
}
