package org.skaggsm.kattis

import javax.script.ScriptEngineManager

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 5/3/2018.
  */
object calculator {

  def main(args: Array[String]): Unit = {
    val factory = new ScriptEngineManager
    val engine = factory.getEngineByName("JavaScript")

    var line = StdIn.readLine
    while (line != null && line != "") {
      line = line.replace("-", " -")
      val result = engine.eval(s"($line).toFixed(2)")

      println(result)

      line = StdIn.readLine
    }
  }
}
