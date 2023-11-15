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
    
    // brutforce
    public ListNode middleNode1(ListNode head) {

        ListNode temp = head;
        
        if(temp==null){
            return null;
        }
        
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        
        int mid = count/2;
        ListNode temp1 = head;
        while(mid>0){
            temp1=temp1.next;
            mid--;
        }
        
        return temp1;
        
    }
    
    // fast and slow pointer
    public ListNode middleNode(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;
    
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        if(fast.next!=null) return slow.next;
        else return slow;
        
        
        
    }
}