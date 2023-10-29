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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        boolean same = isSame(root, subRoot);
        if(root.left != null)
            same = same || isSubtree(root.left, subRoot);
        if(root.right != null)
            same = same || isSubtree(root.right, subRoot);
        
        return same;
    }

    public boolean isSame(TreeNode p, TreeNode q) {
        if(p != null && q != null) {
            if(p.val == q.val) {
                boolean left = isSame(p.left, q.left);
                boolean right = isSame(p.right, q.right);

                return left && right;
            }
        } else if(p == null && q == null) {
            return true;
        }

        return false;
    }
}