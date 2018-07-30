package org.skaggsm.kattis

import scala.io.StdIn

/**
  * Created by Mitchell Skaggs on 7/29/2018.
  */
object permutationdescent {

  def main(args: Array[String]): Unit = {

    val cases = StdIn.readInt()

    Stream.fill(cases)(StdIn.readLine())
      .foreach(l => {
        val Array(index, n, k) = l.split(' ').map(_.toInt)

        println(s"$index ${modEulerianNumber(n, k, 1001113)}")
      })
  }

  def modEulerianNumber(n: BigInt, k: BigInt, mod: BigInt): BigInt = {
    (BigInt(0) to (k + 1)).map(j => {
      ((if (j % 2 == 0) 1 else -1) * modBinomialCoeff(n + 1, j, mod) * (k - j + 1).modPow(n, mod)) % mod
    })
      .sum % mod
  }

  //Needs to be implemented: https://fishi.devtail.io/weblog/2015/06/25/computing-large-binomial-coefficients-modulo-prime-non-prime/
  def modBinomialCoeff(n: BigInt, k: BigInt, mod: BigInt): BigInt = {

    var num = BigInt(1)
    var inverseDenom = BigInt(1)
    var extraDenom = BigInt(1)

    var reached17 = false

    var numList = Seq[BigInt]()
    var denomList = Seq[BigInt]()

    for (i <- BigInt(0) until (k min n - k)) {
      num *= n - i
      num %= mod

      val den = i + 1

      if (den % 17 == 0) {
        extraDenom *= 17
        inverseDenom *= den / 17
      }
      else {
        inverseDenom *= i + 1

        //println(s"Inverting: $inverseDenom")
        inverseDenom = inverseDenom.modInverse(mod)
        //println(s"Done: $inverseDenom")
      }

      numList :+= (n - 1)
      denomList :+= (i + 1)
      //temp %= mod
    }

    //println(num)
    //println(inverseDenom)

    println(num)
    println(inverseDenom)
    println(extraDenom)

    val result = (num * inverseDenom / extraDenom) % mod
    println(s"$n choose $k mod $mod = $result")
    result

    /*
    (BigInt(1) to (k min n - k))
      .foldLeft(BigInt(1))((z, i) => {
        ((z * (n - i - 1)) / i) //% mod
      }).out % mod*/
  }
}
