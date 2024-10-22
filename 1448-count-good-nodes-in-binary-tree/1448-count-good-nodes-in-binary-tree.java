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
    public int goodNodes(TreeNode root) {
        if (root == null) return 0;
        return helper(root,root.val);
    }
    public int helper(TreeNode node, int maxVal){
        int c = 0;
        if(node.val >= maxVal) c++;
        if (node.left != null) c += helper(node.left, Math.max(maxVal,node.val));
        if (node.right != null) c += helper(node.right, Math.max(maxVal,node.val));
        return c;
    }
}