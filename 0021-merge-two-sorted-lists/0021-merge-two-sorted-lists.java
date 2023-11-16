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
    public ListNode mergeTwoLists1(ListNode a, ListNode b) {
        if(a==null && b==null){
            return null;
        }
        if(a==null && b!=null){
            return b;
        }
        if(a!=null && b==null){
            return a;
        }
        
        ListNode dummy = new ListNode(0);
        ListNode tail=dummy;
        while(a!=null && b!=null){
            if(a.val <= b.val){
                tail.next=a;
                a= a.next;
            }
            else{
                tail.next = b;
                b=b.next;
            }
            tail=tail.next;
        }
        
        if(a==null){
            tail.next =b;
        }
        if(b==null){
            tail.next=a;
        }
        return dummy.next;
    }
    
    public ListNode mergeTwoLists(ListNode a, ListNode b){
        
        
        
        if(a==null) return b;
        if(b==null) return a;
        if(a==null && b==null) return null;
        
       // ListNode result = new ListNode();
       // ------- OR ----------
        // ----------------
        ListNode result;
        if(a.val<=b.val){
            result = a;
            a=a.next;
        }else{
            result = b;
            b=b.next;
        }
        //----------------
        ListNode itr = result;
        while(a!=null && b!=null){
            if(a.val <= b.val){
                itr.next = a;
                a = a.next; 
            }else{
                itr.next = b;
                 b = b.next;
            }
            itr=itr.next;
        }
        if(a==null) itr.next = b;
        else itr.next = a;
        
        return result;
    }
}