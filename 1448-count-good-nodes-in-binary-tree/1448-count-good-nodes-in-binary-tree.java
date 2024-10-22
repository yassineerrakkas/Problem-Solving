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
    public int helper(TreeNode node, int rootVal){
        if(node == null) return 0;
        int newVal = Math.max(node.val,rootVal);
        if(node.val < rootVal) return  helper(node.right,newVal) + helper(node.left,newVal);
        else return helper(node.right,newVal) + helper(node.left,newVal) + 1;
    }
}