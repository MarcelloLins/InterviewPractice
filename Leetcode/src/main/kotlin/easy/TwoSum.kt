package easy

/* 001 - Two Sum: https://leetcode.com/problems/two-sum/
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.
*/
fun TwoSum(nums: IntArray, target: Int): IntArray {
  for(x in nums.indices) {
    for(y in nums.indices) {
      if(x == y) continue
      if(nums[x] + nums[y] == target) return intArrayOf(x,y)
    }
  }
  // invalid response
  return intArrayOf()
}

// Iterates only once over the array, keeping a map of the complement of the target to
// the index where that number was found
fun TwoSumFaster(nums: IntArray, target: Int): IntArray {
  val mapOfDiffs = mutableMapOf<Int, Int>()

  nums.forEachIndexed{idx, num ->
    mapOfDiffs[num]?.let{ x -> return intArrayOf(x, idx) }
    val wanted = target - num
    mapOfDiffs[wanted] = idx
  }
  // invalid response
  return intArrayOf()
}