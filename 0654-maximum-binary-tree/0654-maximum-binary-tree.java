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
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        
        return maxTree(nums,0,nums.length-1);
        
    }
    
    static TreeNode maxTree(int[] nums,int l,int h){
        if(l>h){
            return null;
        }
        
        int max = getMax(nums,l,h);
        TreeNode root = new TreeNode(nums[max]);
        root.left = maxTree(nums,l,max-1);
        
        root.right =  maxTree(nums,max+1,h);
        
        return root;
    }
    
    static int getMax(int[] nums,int l,int h){
        int max = l;
        
        for(int i=l;i<=h;i++){
            if(nums[i]>nums[max]){
                max=i;
            }
        }
        return max;
    }
}