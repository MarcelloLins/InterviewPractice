package easy

import java.util.Stack

/**
 *
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 *
 * An input string is valid if:
 *
 *   Open brackets must be closed by the same type of brackets.
 *   Open brackets must be closed in the correct order.
 *   Every close bracket has a corresponding open bracket of the same type.
 *
 *   { [ ] }
 *
 */
class ValidParentheses {
  fun isValid(s: String): Boolean {
    val complements = mapOf(
      ')' to '(',
      ']' to '[',
      '}' to '{'
    )
    val symbolsSeen = Stack<Char>()
    s.forEach {
      if(!it.isClosingBracket()) {
        symbolsSeen.push(it)
      } // Closing Symbol
      else {
        // Did we reach a closing symbol without a previous opening symbol ?
        if(symbolsSeen.empty()) return false
        // Was the last symbol we found the complement of the current one ?
        val lastSeen = symbolsSeen.pop()
        if(lastSeen != complements[it]) return false
      }
    }
    // Do we have any leftover unmatched symbols?
    return symbolsSeen.empty()
  }

  fun Char.isClosingBracket(): Boolean {
    return this == ')' || this == '}' || this == ']'
  }
}