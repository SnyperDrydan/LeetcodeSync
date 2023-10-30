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
    List<List<Integer>> list = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        traverse(root, 0);
        return list;
    }

    public void traverse(TreeNode node, Integer level) {
        if(node == null)
            return;
        List<Integer> l = null;
        if(list.size() > level) {
            l = list.get(level);
            l.add(node.val);
            list.set(level, l);
        } else {
            l = new ArrayList<>();
            l.add(node.val);
            list.add(level, l);
        }
        traverse(node.left, level+1);
        traverse(node.right, level+1);
    }
}