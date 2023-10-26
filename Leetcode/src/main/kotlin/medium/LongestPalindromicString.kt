package medium

/**
 * 005 - Longest Palindromic Substring: https://leetcode.com/problems/longest-palindromic-substring/
 *
 * Given a string s,return the longest
 * palindromic substring in s.
 *
 * Example 1:
 * Input: s = "babad"
 * Output: "bab"
 * Explanation: "aba" is also a valid answer.
 *
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 *
 */
class LongestPalindromicString {
  fun longestPalindrome(s: String): String {
    var currentLongest = ""

    for(center in s.indices){
      var found = ""
      found = searchPalindrome(s, center, center)
      // did we find a longer one?
      if(found.length > currentLongest.length) currentLongest = found

      // handles palindromes of even length
      found = searchPalindrome(s, center, center + 1)
      // did we find a longer one?
      if(found.length > currentLongest.length) currentLongest = found
    }

    return currentLongest
  }

  // expands the search for a palindrome to both sides, starting at a given index
  private fun searchPalindrome(s: String, left: Int, right: Int): String {
    var offSet = 0

    do {
      // attempts to expand search to left and right
      val leftChar = s.getOrNull(left - offSet)
      val rightChar = s.getOrNull(right + offSet)

      if(leftChar == null || rightChar == null) break

      // are they equal ?
      if(leftChar != rightChar) break

      offSet += 1
    } while (true)

    // Single character strings are valid palindromes
    if(offSet == 0) return s.substring(0, 1)
    return s.substring(left - offSet + 1, right + offSet)
  }
}