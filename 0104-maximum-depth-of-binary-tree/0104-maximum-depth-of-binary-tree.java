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
    int count = 0;
    public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        // count++;
        // if(root.left!=null){
        //     return maxDepth(root.left);
        // }
        // if(root.right!=null){
        //     return maxDepth(root.right);
        // }
        // return count;
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        return Math.max(left,right)+1;
    }
}