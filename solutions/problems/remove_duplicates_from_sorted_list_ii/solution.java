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
    public ListNode deleteDuplicates(ListNode head) {
        Map<Integer, Integer> map = new HashMap<>();
        ListNode node = head;

        // Count the occurrences of each value
        while (node != null) {
            map.put(node.val, map.getOrDefault(node.val, 0) + 1);
            node = node.next;
        }

        // Reset node to the head of the list
        node = head;
        ListNode prev = new ListNode(0);
        prev.next = node;
        ListNode res = prev;

        while (node != null) {
            if (map.get(node.val) == 1) {
                prev.next = node;
                prev = node;
            }
            node = node.next;
        }

        prev.next = null;

        return res.next;
    }
}