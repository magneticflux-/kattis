package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/5/2018.
  */
object tri {

  def main(args: Array[String]): Unit = {
    val Array(a, b, c) = StdIn.readLine().split(' ').map(_.toInt)

    val equations = for (operations <- Seq(Add, AddRight, Sub, SubRight, Mul, MulRight, Div, DivRight)) yield ((a, b, c), operations)

    val solution = equations.find(eq => {
      val (trio, op) = eq
      op match {
        case Add => trio._1 + trio._2 == trio._3
        case AddRight => trio._1 == trio._2 + trio._3
        case Sub => trio._1 - trio._2 == trio._3
        case SubRight => trio._1 == trio._2 - trio._3
        case Mul => trio._1 * trio._2 == trio._3
        case MulRight => trio._1 == trio._2 * trio._3
        case Div => trio._1 / trio._2 == trio._3 && trio._1 % trio._2 == 0
        case DivRight => trio._1 == trio._2 / trio._3 && trio._2 % trio._3 == 0
      }
    })

    println(solution match {
      case Some(((x, y, z), op)) => op match {
        case Add => s"$x+$y=$z"
        case AddRight => s"$x=$y+$z"
        case Sub => s"$x-$y=$z"
        case SubRight => s"$x=$y-$z"
        case Mul => s"$x*$y=$z"
        case MulRight => s"$x=$y*$z"
        case Div => s"$x/$y=$z"
        case DivRight => s"$x=$y/$z"
      }
      case _ => throw new MatchError(())
    })
  }

  sealed trait Operation

  case object Add extends Operation

  case object AddRight extends Operation

  case object Sub extends Operation

  case object SubRight extends Operation

  case object Mul extends Operation

  case object MulRight extends Operation

  case object Div extends Operation

  case object DivRight extends Operation

}
