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
    public ListNode deleteMiddle(ListNode head) {
         ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while(fast.next!=null && fast.next.next!=null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast.next!=null)  slow.next = slow.next.next;
        else{
            if(prev==null){
                head = head.next;
            }else{
                 prev.next =  prev.next.next;
            }
        }
        return head;
    }
}