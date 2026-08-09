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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode temp=new ListNode(-11111);
        ListNode t1=temp;
        ListNode t=head;
        t1.next=t;
        t1=t;
        if(head==null) return head;
        while(t.next!=null){
            while(t1.val==t.next.val){
                t=t.next;
                if(t.next==null){
                    break;
                }
            }
            t=t.next;
            t1.next=t;
            t1=t;
            if(t==null) break;
        }
        return temp.next;
    }
}