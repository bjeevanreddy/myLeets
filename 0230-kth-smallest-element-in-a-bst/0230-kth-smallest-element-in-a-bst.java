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
    // with extra space
//     public int kthSmallest(TreeNode root, int k) {
//         List<Integer> l = new ArrayList<>();
//         helper(root, l);
//         return l.get(k-1);
//     }
    
//     void helper(TreeNode r, List<Integer> l){ 
//         if(r==null) return;
//         helper(r.left, l);
//         l.add(r.val);
//         helper(r.right, l);
//     }
 
    // ======================================without extra arary+=======
    int c=0;
    int x=0;
     public int kthSmallest1(TreeNode root, int k) {
         
        helper1(root,k);
        return x;
    }
    
    void helper1(TreeNode r, int k){ 
        if(r==null) return;
        helper1(r.left, k);
        c++;
        if(k == c){
            x = r.val;
            return;
        }
        helper1(r.right, k);
    }
    
    //===========================
    // proiotry queue
    public int kthSmallest(TreeNode root, int k) {
         PriorityQueue<Integer> q = new PriorityQueue<>((a,b) -> a-b);
        helper(root,q);
        while(--k > 0){
            q.poll();
        }
        return q.poll();
    }
    
    void helper(TreeNode r, PriorityQueue<Integer> q){ 
        if(r==null) return;
        helper(r.left, q);
        q.offer(r.val);
        helper(r.right, q);
    }
    
}