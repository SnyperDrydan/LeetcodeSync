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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        int length = 1;
        ListNode node = head;
        while(node.next != null) {
            length++;
            node = node.next;
        }

        k = k%length;

        if (k == 0) {
            return head;
        }

        node = head;
        for(int i = 1; i < length - k; i++) {
            node = node.next;
        }

        ListNode newHead = node.next;
        node.next = null;

        node = newHead;
        while (node.next != null) {
            node = node.next;
        }
        node.next = head;

        return newHead;
    }
}