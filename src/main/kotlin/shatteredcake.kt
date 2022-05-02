import kotlin.math.roundToInt

fun main() {
    val width = readLine()!!.toDouble()
    val pieces = readLine()!!.toInt()
    val area = (0 until pieces).map {
        val (a, b) = readLine()!!.split(" ").map(String::toDouble)
        a * b
    }.sum()
    val length = area / width
    println(length.roundToInt())
}
