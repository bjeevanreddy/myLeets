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
    public int kthSmallest(TreeNode root, int k) {
        
        List<Integer> l = new ArrayList<>();
        
        helper(root, l);
        System.out.println(l);
        return l.get(k-1);
    }
    
    void helper(TreeNode r, List<Integer> l){
        
        if(r==null) return;
       
        helper(r.left, l);
        l.add(r.val);
        helper(r.right, l);
    }
}