package easy;

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ValidParenthesesTest {
  @Test
  fun testValidParentheses(){
    val subject = ValidParentheses()
    var input = "()"
    assertEquals(true, subject.isValid(input))

    input = "()[]{}"
    assertEquals(true, subject.isValid(input))

    input = "(}"
    assertEquals(false, subject.isValid(input))

    input = "{[]}"
    assertEquals(true, subject.isValid(input))
  }
}