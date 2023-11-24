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
        return getLength(root, 0);
    }

    public int getLength(TreeNode root, int level) {
        if(root == null)
            return level;

        level++;

        return Math.max(getLength(root.left, level), getLength(root.right, level));
    }
}