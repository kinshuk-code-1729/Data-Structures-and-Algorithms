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
    public int maxAncestorDiff(TreeNode root) {
        return traverse(root,root.val,root.val);
    }
    private int traverse(TreeNode node,int mx,int mn){
        if(node == null){
            return 0;
        }
        mx = Math.max(mx,node.val);
        mn = Math.min(mn,node.val);

        int left = traverse(node.left,mx,mn);
        int right = traverse(node.right,mx,mn);

        return Math.max(mx - mn, Math.max(left,right));
    }
}