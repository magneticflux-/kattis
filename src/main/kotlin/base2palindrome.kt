fun main() {
    val M = readLine()!!.toInt()

    val palindromes = sequenceOf(1L) + generateSequence(1) { it + 1 }.flatMap {
        val binary = it.toString(2)
        val rev = binary.reversed()
        sequenceOf(
            "$binary$rev".toLong(2),
            "${binary}0$rev".toLong(2),
            "${binary}1$rev".toLong(2)
        )
    }
    val enough = palindromes.take(M * 2 + 3).toList().toLongArray()
    enough.sort()
    val last = enough[M - 1]

    println(last)
}
