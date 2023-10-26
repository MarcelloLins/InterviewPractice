package medium

import kotlin.test.Test
import kotlin.test.assertEquals

class LongestPalindromicStringTest {

  @Test
  fun testLongestPalindromicString(){
    var input = "babad"
    var result = LongestPalindromicString().longestPalindrome(input)
    assertEquals("bab", result)

    input = "cbbd"
    result = LongestPalindromicString().longestPalindrome(input)
    assertEquals("bb", result)

    input = "ac"
    result = LongestPalindromicString().longestPalindrome(input)
    assertEquals("a", result)

    input = "abb"
    result = LongestPalindromicString().longestPalindrome(input)
    assertEquals("bb", result)
  }
}