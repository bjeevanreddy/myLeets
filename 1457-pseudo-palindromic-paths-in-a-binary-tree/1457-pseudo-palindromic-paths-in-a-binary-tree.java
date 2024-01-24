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
    int sum=0;
    public int pseudoPalindromicPaths (TreeNode root) {
        HashMap<Integer, Integer> map = new HashMap<>();
        
        solve(root, map);
        return sum;    
        
    }
    
    void solve(TreeNode root, HashMap<Integer, Integer> map){
       
        if(root==null) {
            return;
        }
         map.put(root.val, map.getOrDefault(root.val,0)+1);
       
        if(root.left==null && root.right==null){
            // System.out.println(map);
            if(checkPalindrome(map)){
                sum+=1;
            }
        }
       
        solve(root.left, map);
        solve(root.right, map);
        int count = map.get(root.val)-1;
        map.put(root.val, count);
    }
    
    boolean checkPalindrome(Map<Integer, Integer> x){
        int count=0;
        for(Integer y:x.values()){
            if(y%2!=0){
                count++;
                if(count>1){
                    return false;
                }
            }
        }
         // if((x.size() % 2 == 1 && count == 1) || (x.size() % 2 == 0 && count == 0)){  // the same conditions as explained above
         //        return true;
         //    }
       return true;
    }
}