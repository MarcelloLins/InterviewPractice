package medium

import org.junit.jupiter.api.Assertions
import kotlin.test.Test

class AddTwoNumbersTest {

  @Test
  fun testAddTwoNumbers() {
    // Test case 1: 342 + 465 = 807
    val l1 = ListNode(2, ListNode(4, ListNode(3)))
    val l2 = ListNode(5, ListNode(6, ListNode(4)))
    val expected1 = ListNode(7, ListNode(0, ListNode(8)))

    val result1 = AddTwoNumbers().addTwoNumbers(l1, l2)
    assertListEquals(expected1, result1)

    // Test case 2: 123 + 987 = 1110
    val l3 = ListNode(3, ListNode(2, ListNode(1)))
    val l4 = ListNode(7, ListNode(8, ListNode(9)))
    val expected2 = ListNode(0, ListNode(1, ListNode(1, ListNode(1))))

    val result2 = AddTwoNumbers().addTwoNumbers(l3, l4)
    assertListEquals(expected2, result2)

    // Test case 3: 0 + 0 = 0
    val l5 = null
    val l6 = null
    val expected3 = null

    val result3 = AddTwoNumbers().addTwoNumbers(l5, l6)
    assertListEquals(expected3, result3)

    // Test case 4: 999 + 1 = 1000
    val l7 = ListNode(9, ListNode(9, ListNode(9)))
    val l8 = ListNode(1)
    val expected4 = ListNode(0, ListNode(0, ListNode(0, ListNode(1))))

    val result4 = AddTwoNumbers().addTwoNumbers(l7, l8)
    assertListEquals(expected4, result4)
  }

  private fun assertListEquals(expected: ListNode?, actual: ListNode?) {
    var expectedNode = expected
    var actualNode = actual

    while (expectedNode != null && actualNode != null) {
      Assertions.assertEquals(expectedNode.`val`, actualNode.`val`)
      expectedNode = expectedNode.next
      actualNode = actualNode.next
    }

    Assertions.assertEquals(expectedNode, actualNode)
  }
}