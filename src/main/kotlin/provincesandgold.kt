fun main() {
    val (G, S, C) = readLine()!!.split(" ").map(String::toInt)
    val buyingPower = G * 3 + S * 2 + C

    val bestTreasure = when {
        buyingPower >= 6 -> "Gold"
        buyingPower >= 3 -> "Silver"
        else -> "Copper"
    }
    val bestVictory = when {
        buyingPower >= 8 -> "Province"
        buyingPower >= 5 -> "Duchy"
        buyingPower >= 2 -> "Estate"
        else -> null
    }

    if (bestVictory == null)
        println(bestTreasure)
    else
        println("$bestVictory or $bestTreasure")
}
