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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length -1, inorder, 0, inorder.length -1);
    }

    public TreeNode buildTree(int[] preorder, int startPre, int endPre, int[] inorder, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode node = new TreeNode(preorder[startPre]);
        int rootIndex = startIn;
        while (inorder[rootIndex] != preorder[startPre]) {
            rootIndex++;
        }

        int leftSubtreeSize = rootIndex - startIn;

        node.left = buildTree(preorder, startPre + 1, startPre + leftSubtreeSize, inorder, startIn, rootIndex - 1);
        node.right = buildTree(preorder, startPre + leftSubtreeSize + 1, endPre, inorder, rootIndex + 1, endIn);
        return node;
    }
}