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
    int max = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        if(root==null){
            return 0;
        }
        
        findMax(root);
        return max;
    }
    
    public int findMax(TreeNode root){
        
       
        if(root==null){
            return 0;
        }
        
        int left = Math.max(findMax(root.left),0);
        
        
        int right = Math.max(findMax(root.right),0);
        
        int sum = left + right + root.val;
        max = Math.max(max,sum );
        return Math.max(left,right) + root.val;
    }
}