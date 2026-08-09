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
    public boolean isPalindrome(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        if(head.next==null) return true;
        while(fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(fast.next==null) break;
        }
         ListNode curr=slow.next;
        ListNode agla=slow.next.next;
        ListNode pre=slow.next;
        if(curr==slow.next){
            curr.next=null;
        }
        while(agla!=null){
            curr=agla;
            agla=agla.next;
            curr.next=pre;
            pre=curr;
        }
        ListNode p1=head;
        ListNode p2=pre;
        while(p1!=slow.next && p2!=null){
            if(p1.val!=p2.val){
                return false;
            }
            p1=p1.next;
            p2=p2.next;
        }
        return true;
    }
}