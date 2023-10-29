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
    public int maxDepth(TreeNode root) {

        if(root == null)
            return 0;
        
        return lengthOfNode(root, 1);
        
    }

    public int lengthOfNode(TreeNode node, int len) {
        if(node == null) {
            return len;
        }
        if(node.left == null && node.right == null)
            return len;
        len++;
        int left = 0, right = 0;
        if(node.left != null) {
            left = lengthOfNode(node.left, len);
        } 
        if(node.right != null) {
            right = lengthOfNode(node.right, len);
        }

        return Math.max(left, right);
    }
}