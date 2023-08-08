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
    public ListNode middleNode(ListNode head) {
        
        
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
        while(mid>0 && temp1!=null){
            temp1=temp1.next;
            mid--;
        }
        
        return temp1;
        
        
        
        
    }
}