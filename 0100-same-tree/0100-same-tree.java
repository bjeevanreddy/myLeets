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
    public boolean isSameTree(TreeNode p, TreeNode q) {
//         List<Integer> listp = new LinkedList<>();
//          List<Integer> listq = new LinkedList<>();
//         List<Integer> listp1 = preOrder( p,listp);
//         List<Integer> listq1 = preOrder( q,listq);
        
        // if(listp1.equals(listq1)){
        //     return true;
        // }
        // return false;
        
        // method 2 //
        
        
        
        if(p==null && q==null){
            return true;
        }
        
        if(p==null || q==null){
            return false;
        }
        
        if(p.val!=q.val){
            return false;
        }
        
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    
    // public  List<Integer> preOrder(TreeNode temp, List<Integer> list){
    //     if(temp==null){
    //         list.add(0);
    //         return list;
    //     }
    //     list.add(temp.val);
    //     preOrder(temp.left,list);
    //     preOrder(temp.right,list);
    //     return list;
    // }
}