package com.deiiviit.leetcode_kotlin.reto00_two_sum

class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = mutableMapOf<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return intArrayOf()
    }
}

fun main(){
val twoSum = TwoSum()
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum.twoSum(nums, target)
    println(result.contentToString())
}