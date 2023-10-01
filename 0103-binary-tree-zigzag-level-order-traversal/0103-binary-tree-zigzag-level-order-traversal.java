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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
    
        if(root!=null){
            q.add(root); 
        }
         boolean flag = true;//left2right
       while(!q.isEmpty()) {
            int size = q.size();
            int[] temp = new int[size];
          
           for(int i=0;i<size;i++){
               TreeNode node = q.poll();
                // TreeNode popped = q.peek();
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
                int index  = flag ? i : (size-1-i);
                temp[index] = node.val;
               
           }
           flag=!flag;
           List<Integer> sub = new ArrayList<>();
           for(int i:temp){
               sub.add(i);
           }
           result.add(sub);
           
       }
        
        return result;
        
    }
}