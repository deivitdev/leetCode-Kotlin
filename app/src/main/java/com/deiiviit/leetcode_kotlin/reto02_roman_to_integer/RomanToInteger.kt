package com.deiiviit.leetcode_kotlin.reto02_roman_to_integer

fun romanToInt(s: String): Int {
    val romanMap = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var total = 0
    var prev = 0

    for (c in s) {
        val current = romanMap[c] ?: 0
        total += current
        if (current > prev) {
            total -= 2 * prev
        }
        prev = current
    }

    return total
}

fun main() {
    println(romanToInt("VC"))     // Output: 3 : 1994
}