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
    public ListNode removeElements1(ListNode head, int val) {
        
        // ListNode h=head;
        if(head==null){
            return null;
        }
        
        ListNode p=new ListNode();
        p.next=head;
        ListNode h=p;
        
        while(h.next != null){
            if(h.next.val==val){
                h.next=h.next.next;   
            }else h=h.next;
        }
        
        return p.next;
    }
    
     public ListNode removeElements(ListNode head, int val) {
        
        // ListNode h=head;
        if(head==null){
            return null;
        }
        
        ListNode result=new ListNode();
        result.next=head;
         ListNode h= head;
        ListNode prev=result;
         
        
        while(h != null){
            if(h.val==val){
                prev.next=h.next;
            }else{
                prev=h;
               
            }
            //     h.next=h.next.next;   
            // }else h=h.next;
             h=h.next;
        }
        
        return result.next;
    }
    
}