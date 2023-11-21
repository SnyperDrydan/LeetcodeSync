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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        Stack<Integer> stack = new Stack<>();
        int current = 1;
        ListNode node = head;
        while(node != null) {
            if(current >= left && current <= right) {
                stack.push(node.val);
            }
            node = node.next;
            current++;
        }

        current = 1;
        node = head;
        while(node != null) {
            if(current >= left && current <= right) {
                node.val = stack.pop();
            }
            node = node.next;
            current++;
        }

        return head;
    }
}