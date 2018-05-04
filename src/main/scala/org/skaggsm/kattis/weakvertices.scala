package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object weakvertices {
  def main(args: Array[String]): Unit = {
    var line = StdIn.readLine

    while (line != "-1") {

      val size = line.toInt
      val vertices = 0 until size toSet

      val edges = (0 until size).flatMap(row => {
        StdIn.readLine.split(' ').map(_.toInt).zipWithIndex.flatMap {
          case (0, _) => None
          case (1, col) => Some(Set(row, col))
        }
      }).toSet

      val weakVertices = vertices.filter(vertex => {
        val adjVertices = edges.filter(_.contains(vertex)).flatten - vertex

        adjVertices.subsets(2).toSet.intersect(edges).isEmpty
      })


      println(weakVertices.toSeq.sorted.mkString(" "))

      line = StdIn.readLine
    }
  }
}
