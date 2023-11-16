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
    public ListNode sortList(ListNode head) {
        
        if(head==null || head.next==null) return head;
        ListNode middle = getMiddle(head);
        ListNode h2 = middle.next;
        middle.next=null;
        ListNode h1 = sortList(head);
        h2=sortList(h2);
        return mergeTwoLists(h1, h2);
    }
    
    static ListNode getMiddle(ListNode head){
        
        ListNode s = head;
        ListNode f = head;
        while(f.next!=null && f.next.next!=null){
            s= s.next;
            f=f.next.next;
        }
        
        return s;
    }
    public static ListNode mergeTwoLists(ListNode a, ListNode b){
        
        
        
        if(a==null) return b;
        if(b==null) return a;
        if(a==null && b==null) return null;
        
        // creating dummy node
       // ListNode result = new ListNode();
       // ------- OR ----------
        // ----------------
        // creating dummy node but pointing to any of the list, 
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