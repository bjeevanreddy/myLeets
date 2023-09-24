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
    public boolean isBalanced(TreeNode root) {
       return helper(root);
    }
    
   static boolean helper(TreeNode root){
        
        if(root==null){
            return true;
        }
        
        int l = height(root.left);
       int r = height(root.right);
       
       if(Math.abs(l-r)>1) return false;
      
       return helper(root.left) && helper(root.right);
       
    }
    
    static int height(TreeNode node){
        if(node==null) return 0;
        
        return 1+Math.max(height(node.left),height(node.right));
    }
}