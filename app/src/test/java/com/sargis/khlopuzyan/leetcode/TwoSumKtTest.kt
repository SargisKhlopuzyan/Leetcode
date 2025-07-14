package com.sargis.khlopuzyan.leetcode

import com.google.common.truth.Truth
import org.junit.Test

class TwoSumKtTest {

    val nums1 = arrayOf(2, 7, 11, 15)
    val target1 = 9
    val output1 = arrayOf(0, 1)

    val nums2 = arrayOf(3, 2, 4)
    val target2 = 6
    val output2 = arrayOf(1, 2)

    val nums3 = arrayOf(3, 3)
    val target3 = 6
    val output3 = arrayOf(0, 1)

    val nums4 = arrayOf(-3, 3)
    val target4 = 6
    val output4 = arrayOf(-1, -1)

    val nums5 = arrayOf(3)
    val target5 = 6
    val output5 = arrayOf(-1, -1)

    @Test
    fun `nums1_target1_indices of the two numbers such that they add up to target_returns_output1`() {
        Truth.assertThat(twoSum(nums1, target1)).isEqualTo(output1)
    }

    @Test
    fun `nums2_target2_indices of the two numbers such that they add up to target_returns_output2`() {
        Truth.assertThat(twoSum(nums2, target2)).isEqualTo(output2)
    }

    @Test
    fun `nums3_target3_indices of the two numbers such that they add up to target_returns_output3`() {
        Truth.assertThat(twoSum(nums3, target3)).isEqualTo(output3)
    }

    @Test
    fun `nums4_target4_indices of the two numbers such that they add up to target_returns_output4`() {
        Truth.assertThat(twoSum(nums4, target4)).isEqualTo(output4)
    }

    @Test
    fun `nums5_target5_indices of the two numbers such that they add up to target_returns_output5`() {
        Truth.assertThat(twoSum(nums5, target5)).isEqualTo(output5)
    }
}