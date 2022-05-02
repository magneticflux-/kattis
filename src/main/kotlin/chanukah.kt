fun main() {
    val cases = readLine()!!.toInt()

    for (i in 1..cases) {
        val (case, days) = readLine()!!.split(" ").map(String::toInt)
        val candles = days + days * (days + 1) / 2
        println("$case $candles")
    }
}
