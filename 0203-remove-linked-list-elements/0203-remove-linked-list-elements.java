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
    public ListNode removeElements(ListNode head, int val) {
        
        // ListNode h=head;
        if(head==null){
            return null;
        }
        
        ListNode p=new ListNode();
        p.next=head;
        ListNode h=p;
        
        while(h.next != null){
            if(h.next.val==val){
                // ListNode prev= h;
                h.next=h.next.next;
                // prev.next=n;    
            }else h=h.next;
        }
        
        return p.next;
    }
}