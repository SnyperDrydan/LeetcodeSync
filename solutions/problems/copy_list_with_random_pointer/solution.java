/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {

        if(head == null) 
            return null;
        
        Map<Node, Node> nodeMappings = new HashMap<>();

        Node node = head;

        while(node != null) {
            nodeMappings.put(node, new Node(node.val));
            node = node.next;
        }

        node = head;

        while(node != null) {
            nodeMappings.get(node).next = nodeMappings.get(node.next);
            nodeMappings.get(node).random = nodeMappings.get(node.random);
            node = node.next;
        }

        return nodeMappings.get(head);
    }
}