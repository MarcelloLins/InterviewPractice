package easy

import org.junit.jupiter.api.Test
import kotlin.test.assertContentEquals

class TwoSumTest {
  @Test
  fun testTwoSumFaster_ValidInput() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val expected = intArrayOf(0, 1)

    var result = TwoSumFaster(nums, target)
    assertContentEquals(expected, result)
    result = TwoSum(nums, target)
    assertContentEquals(expected, result)
  }

  @Test
  fun testTwoSumFaster_NoSolution() {
    val nums = intArrayOf(1, 2, 3, 4, 5)
    val target = 10
    val expected = intArrayOf()

    var result = TwoSumFaster(nums, target)
    assertContentEquals(expected, result)
    result = TwoSum(nums, target)
    assertContentEquals(expected, result)
  }

  @Test
  fun testTwoSumFaster_EmptyInput() {
    val nums = intArrayOf()
    val target = 5
    val expected = intArrayOf()
    var result = TwoSumFaster(nums, target)
    assertContentEquals(expected, result)
    result = TwoSum(nums, target)
    assertContentEquals(expected, result)
  }

  @Test
  fun testTwoSumFaster_TargetIsDouble() {
    val nums = intArrayOf(3, 2, 4)
    val target = 6
    val expected = intArrayOf(1, 2)
    var result = TwoSumFaster(nums, target)
    assertContentEquals(expected, result)
    result = TwoSum(nums, target)
    assertContentEquals(expected, result)
  }

  @Test
  fun testTwoSumFaster_RepeatedNumbers() {
    val nums = intArrayOf(3, 3)
    val target = 6
    val expected = intArrayOf(0, 1)
    var result = TwoSumFaster(nums, target)
    assertContentEquals(expected, result)
    result = TwoSum(nums, target)
    assertContentEquals(expected, result)
  }
}