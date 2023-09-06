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
    public ListNode[] splitListToParts(ListNode head, int k) {

        int length = getLength(head);

        int partLength = length / k;
        int reminder = length % k;

        ListNode[] result = new ListNode[k];
        ListNode temp = head;
        int count = 0;

        for (int i = 0; i < k; i++) {
            int size = partLength;
            if(reminder > 0) {
                reminder--;
                size++;
            }

            result[i] = temp;

            for(int j = 0; j < size-1; j++) {
                temp = temp.next;
            }

            if(temp != null) {
                ListNode next = temp.next;
                temp.next = null;
                temp = next;
            }


        }

        return result;

        
    }

    public int getLength(ListNode head) {
        int length = 0;
        ListNode temp = head;
        while (temp != null) {
            length++;
            temp = temp.next;
        }

        return length;
    }
}