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
    public List<Integer> rightSideView(TreeNode root) {
        traverseRight(root, 0);
        return list;
    }

    public void traverseRight(TreeNode node, Integer level) {
        if(node == null)
            return;
        if(list.size() > level) {
            list.set(level, node.val);
        } else {
            list.add(level, node.val);
        }
        traverseRight(node.left, level+1);
        traverseRight(node.right, level+1);
    }
}