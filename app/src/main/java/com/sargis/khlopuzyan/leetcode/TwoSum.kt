package com.sargis.khlopuzyan.leetcode

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/description/?envType=problem-list-v2&envId=xi4ci4ig
 *
 * Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
 * You must write an algorithm that runs in O(n) time.
 * */
fun twoSum(nums: Array<Int>, target: Int): Array<Int> {
    if (nums.size < 2) {
        println("Result -> $nums must have at leas 2 elements")
        return arrayOf(-1, -1)
    }

    (0 until nums.size - 1).forEach { i ->
        (i + 1 until nums.size).forEach { j ->
            if (nums[i] + nums[j] == target) {
                return arrayOf(i, j)
            }
        }
    }

    return arrayOf(-1, -1)
}