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
    Integer maxf=0;
    HashMap<Integer,Integer> map= new HashMap<>();
    public int[] findFrequentTreeSum(TreeNode root) {
        
        
        
        // max= 0;
         helper(root);
        
        List<Integer> list = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
             Integer sum = entry.getKey();
            Integer freq = entry.getValue();
            if(freq==maxf){
                list.add(sum);
            }
        }
        
        int maxFreqSums[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            maxFreqSums[i] =  list.get(i).intValue();
        }
        return maxFreqSums;
        
        
    }
    
    int helper(TreeNode root)
    {
        if(root==null) {
            return 0;
        }
        
        int left =helper(root.left);
        int right = helper(root.right);
       
        int sum = root.val + left + right;
        
        map.put(sum, map.getOrDefault(sum,0)+1);
        maxf= Math.max(maxf,map.get(sum));
        
        return sum;
         
    }
    
}