fun main() {
    val lines = System.`in`.reader().buffered(512 * 1024).readLines().iterator()
    var (jack, jill) = read(lines)

    while (jack != 0 && jill != 0) {
        val jacks = IntArray(jack) { lines.next().toInt() }
        val jills = IntArray(jill) { lines.next().toInt() }

        var numShared = 0
        var jacksI = 0 // Behind the indices are already checked
        var jillsI = 0

        while (jacksI < jacks.size && jillsI < jills.size) {
            val cmp = jacks[jacksI] - jills[jillsI]
            if (cmp == 0) {
                jacksI++
                jillsI++
                numShared++
            } else if (cmp < 0) {
                jacksI++
            } else /* cmp > 0 */ {
                jillsI++
            }
        }

        println(numShared)

        val (a, b) = read(lines)
        jack = a
        jill = b
    }
}

fun read(lines: Iterator<String>): List<Int> {
    return lines.next().split(" ").map(String::toInt)
}
