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

    List<Integer> list = new ArrayList<>();
    int res = 0;
    public int kthSmallest(TreeNode root, int k) {
        res = k;
        inOrderTraverse(root);
        return list.get(k-1);
    }

    public void inOrderTraverse(TreeNode root) {
        if(root == null || list.size() >= res)
            return;
        
        inOrderTraverse(root.left);
        list.add(root.val);
        inOrderTraverse(root.right);
    }
}