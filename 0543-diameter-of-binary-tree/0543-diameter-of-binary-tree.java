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
    int max= 0;
    public int diameterOfBinaryTree(TreeNode root) {
        
        diamet(root);
        
        return max;
        
    }
    
     int diamet(TreeNode root){
        
       if(root==null) {return 0;}
        int left =  diamet(root.left);
        int right =  diamet(root.right);
        
        max = Math.max(max, left+right);
        
        return 1 + Math.max(left,right);
    }
}