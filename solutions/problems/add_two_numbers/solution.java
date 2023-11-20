/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode res = new ListNode();
        ListNode head = res;
        while(l1 != null || l2 != null || carry != 0) {
            ListNode sum = new ListNode();
            
            int x = 0;
            int y = 0;
            if(l1 != null) {
                x = l1.val;
                l1 = l1.next;
            }

            if(l2 != null) {
                y = l2.val;
                l2 = l2.next;
            }
            sum.val = x + y + carry;
            carry = 0;
            if(sum.val >= 10) {
                sum.val = sum.val%10;
                carry = 1;
            }
            res.next = sum;
            res = res.next;
            
        }
        ListNode result = head.next;
        return result;
    }
}