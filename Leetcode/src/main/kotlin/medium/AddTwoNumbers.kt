package medium

data class ListNode(var `val`: Int, var next: ListNode? = null)

/**
 *
 * 002 - Add Two Numbers: https://leetcode.com/problems/add-two-numbers/
 *
 * You are given two non-empty linked lists representing two non-negative integers.
 * The digits are stored in reverse order, and each of their nodes contains a single digit.
 * Add the two numbers and return the sum as a linked list.
 *
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 */
class AddTwoNumbers {

  fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
    var result :ListNode? = ListNode(0)
    val head = result

    // saving list heads
    var l1Cur = l1
    var l2Cur = l2

    // may have different lengths
    // may result in carry-over (sum > 9)
    // need to build result list as we go
    var carriedOver = false
    while(l1Cur != null || l2Cur != null) {
      // safely read values from list nodes
      val l1Val = l1Cur?.`val` ?: 0
      val l2Val = l2Cur?.`val` ?: 0

      var currVal = l1Val + l2Val
      if(carriedOver) currVal += 1

      // refresh carry over
      carriedOver = (currVal >= 10)
      if(carriedOver) {
        // handle carry over
        currVal -= 10
      }

      // save it on the list
      val next = ListNode(currVal)
      result!!.next = next

      // increment our own list reference
      result = result.next

      // walk on list if needed
      l1Cur = l1Cur.let { l1Cur?.next }
      l2Cur = l2Cur.let { l2Cur?.next }
    }

    // handling last carry over if present
    if(carriedOver){
      result!!.next = ListNode(1)
    }

    return head!!.next
  }
}