/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int count = 0;
    public int goodNodes(TreeNode root) {

        traverseNode(root, Integer.MIN_VALUE);
        return count;
    }

    public void traverseNode(TreeNode node, int largestSoFar) {
        if(node == null)
            return;

        if(node.val >= largestSoFar) {
            count++;
            largestSoFar = node.val;
        }

        traverseNode(node.left, largestSoFar);
        traverseNode(node.right, largestSoFar);
    }
}