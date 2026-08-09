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
    public ListNode reverseList(ListNode head) {
        if(head==null) return head;
        ListNode curr=head;
        ListNode agla=head.next;
        ListNode pre=head;
        if(curr==head){
            curr.next=null;
        }
        while(agla!=null){
            curr=agla;
            agla=agla.next;
            curr.next=pre;
            pre=curr;
        }
        return pre;
    }
}