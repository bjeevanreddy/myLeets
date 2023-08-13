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
    public List<Double> averageOfLevels(TreeNode root) {
         Queue<TreeNode> q= new LinkedList<>();
        List<Double> res=new ArrayList<>();
        if(root==null){
            return res;
        }
        
        q.add(root);
        // res.add(new ArrayList<>(){root.val});
        while(!q.isEmpty()){
            
            int size = q.size();
           
           double sum=0.0;
            int c=size;
            while(size-- >0){
                 if(q.peek().left!=null){
                     q.offer(q.peek().left);
                 }
                if(q.peek().right!=null){
                     q.offer(q.peek().right);
                 }
                 sum+=q.poll().val;
            }
            // if(sum>=Double.MAX_VALUE || sum<= Double.MIN_VALUE){
            //     res.add(Double.MAX_VALUE);
            // }else{
                 res.add(sum/c);
            // }
           
            }
           
            
            return res;
    }
}