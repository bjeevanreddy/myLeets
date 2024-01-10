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
    
    // merge one by one time(KN) space(N)
    public ListNode mergeKLists1(ListNode[] lists) {
         ListNode prev =  null;
        for(int i=0;i<lists.length;i++){
            prev = merge(prev, lists[i]);
        }

        return prev;
    }
    
    //Divide and Conquer
    public ListNode mergeKLists(ListNode[] lists){
        int len = lists.length;
       int left = 0;
       int right = len/2;
        if(len==0) return null;
        else if(len==1) return lists[0];
        ListNode part2=null;
        ListNode part1=null;
        part1 = mergeDQ(lists, left, right);
        if(right+1<=len-1){
              part2 = mergeDQ(lists, right+1, len-1);
        }
      
       ListNode result = merge(part1, part2);
        return result;
    }
    
    static ListNode mergeDQ(ListNode[] lists, int left, int right){
        if(left==right){
            return lists[left]!=null ? lists[left]:null;}
        int total = right-left+1;
        ListNode l=null;
        ListNode r=null;
        ListNode head= null;
         l = mergeDQ(lists, left, left+(total/2)-1);
         r = mergeDQ(lists, left+total/2, right);
         head = merge(l, r);
        return head;
    }
    
    
    // merge 2 sorted linkedlists
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