package com.deiiviit.leetcode_kotlin.reto01_palindrome_number

fun isPalindrome(x: Int): Boolean {
    return x.toString().reversed() == x.toString()
}

fun main() {
    println(isPalindrome(101))
    println(isPalindrome(-101))
    println(isPalindrome(91))
    println(isPalindrome(11))
}