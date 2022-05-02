package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/25/2018.
  */
object prsteni {
  def main(args: Array[String]): Unit = {
    StdIn.readInt()

    val gears = StdIn.readLine().split(' ').map(s => Fraction(s.toInt, 1)).toSeq

    gears.sliding(2).scanLeft(Fraction(1, 1))((speed, gears) => {
      val Seq(gear1, gear2) = gears
      speed * gear1 / gear2
    })
      .drop(1)
      .foreach(f => println(s"${f.num}/${f.den}"))
  }

  case class Fraction(num: Long, den: Long) {
    def -(other: Fraction): Fraction = (this + -other).reduce

    def unary_- : Fraction = Fraction(-num, den)

    def +(other: Fraction): Fraction = Fraction(num * other.den + other.num * den, den * other.den).reduce

    def /(other: Fraction): Fraction = (this * other.recip).reduce

    def *(other: Fraction): Fraction = Fraction(num * other.num, den * other.den).reduce

    def recip: Fraction = Fraction(den, num)

    def reduce: Fraction = {
      var cd = 1
      val limit = math.min(num, den)
      var gcd = cd

      while (cd <= limit) {
        if (num % cd == 0 && den % cd == 0)
          gcd = cd
        cd += 1
      }

      Fraction(num / gcd, den / gcd)
    }
  }

}
