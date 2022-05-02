import java.math.BigInteger
import kotlin.math.min

fun main() {
    val cases = readLine()!!.toInt()

    for (case in 1..cases) {
        val (i, N, v) = readLine()!!.split(" ").map(String::toInt)
        val eulerNumber = euler(N, v)
        println("$i $eulerNumber")
    }
}

val mod: BigInteger = BigInteger.valueOf(1001113)

fun euler(n: Int, m: Int): Int {
    var sum = BigInteger.ZERO
    for (k in 0..(m + 1)) {
        val negated = if (k % 2 == 0) BigInteger.ONE else -BigInteger.ONE
        val binomialMod = binomialMod(n + 1, k, mod)
        val exponentMod = (m + 1 - k).toBigInteger().modPow(n.toBigInteger(), mod)

        val addend = (negated * binomialMod * exponentMod).mod(mod)

        sum = (sum + addend).mod(mod)
    }
    return sum.mod(mod).toInt()
}

fun binomialMod(n: Int, k: Int, mod: BigInteger): BigInteger {
    var num = BigInteger.ONE
    var denom = BigInteger.ONE
    for (i in 1..(min(k, n - k))) {
        num *= (n + 1 - i).toBigInteger()
        denom *= i.toBigInteger()
    }
    return (num / denom) % mod
}
