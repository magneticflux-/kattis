import kotlin.math.roundToLong

fun main() {
    val distance = readLine()!!.toDouble()
    val paces = 1000 * 5280 * distance / 4854
    println(paces.roundToLong())
}
