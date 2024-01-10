/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
         ListNode prev =  null;
        for(int i=0;i<lists.length;i++){
            prev = merge(prev, lists[i]);
        }

        return prev;
    }
    
    static ListNode merge(ListNode a, ListNode b){
        if(a==null && b==null) return null;
        if(a==null && b!=null) return b;
        if(b==null && a!=null) return a;
        
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while(a!=null && b!=null){
            if(a.val<=b.val){
                result.next = a;
                a=a.next;
            }
            else{
                result.next  = b;
                b = b.next;
            } 
            result = result.next;
        }
        if(a!=null){
            result.next = a;
        }else{
            result.next = b;
        }

        return temp.next;
    }
}