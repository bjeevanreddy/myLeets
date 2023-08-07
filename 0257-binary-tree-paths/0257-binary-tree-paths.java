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
    public List<String> binaryTreePaths(TreeNode root) {
       
        List<String> res = new ArrayList<>();
         List<String> ans = new ArrayList<>();
        printPaths(root,"",res);
        // int len =res.size();
        // // ans.addAll(res);
        // for(String x:res){
        //     StringBuilder curr = new StringBuilder();
        //     for(char c: x.toCharArray()){
        //         curr.append(c);
        //         curr.append("->");
        //     }
        //     ans.add(curr.toString().substring(0,curr.length()-2));
        // }
        return res;
        
    }
    
    private static void printPaths(TreeNode root,String curr, List<String> res){
        
        if(root==null){
            return;
        }
        
        curr += root.val+"->";
        
        if(root.left==null && root.right==null){
            res.add(curr.substring(0,curr.length()-2));
            
        }
        printPaths(root.left,curr, res);
        
        printPaths(root.right,curr, res);
        
        // curr = curr.substring(curr.length()-2);
    }
}