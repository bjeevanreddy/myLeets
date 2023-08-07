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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        List<Integer> temp = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        
        printSum(root, targetSum, temp, res);
        return res;
        
    }
    
    void printSum(TreeNode root, int target, List<Integer> temp, List<List<Integer>> res ){
        if(root==null){
            return;
        }
        
        temp.add(root.val);
        if(root.left==null && root.right ==null && root.val== target){
           res.add(new ArrayList<Integer>(temp));
        }else{
              printSum(root.left, target-root.val, temp, res);
                printSum(root.right, target-root.val,temp,res);
        }
        
      
        temp.remove(temp.size()-1);
       
    }
}