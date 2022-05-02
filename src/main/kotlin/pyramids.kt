import kotlin.math.roundToInt

fun main() {
    val blocks = readLine()!!.toDouble()
    val firstFailure = generateSequence(1) { it + 1 }.first { build(it) > blocks }
    println(firstFailure - 1)
}

fun build(n: Int): Int {
    return (n * (4 * n * n / 3.0 - 1 / 3.0)).roundToInt()
}
