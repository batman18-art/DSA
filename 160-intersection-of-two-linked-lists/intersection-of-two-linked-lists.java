/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     static int finLength(ListNode head){
        int count=0;
        ListNode temp=head;
        while (temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      ListNode slow=headA;
        ListNode fast=headB;
        int l1l=finLength(headA);
        int l2l=finLength(headB);
        int m=0;
        if(l1l>l2l){
            m=l1l-l2l;
        for(int i=1;i<=m;i++){
            slow=slow.next;
        }
        }else{
          m=l2l-l1l;
        for(int i=1;i<=m;i++){
            fast=fast
            .next;
        }

        }
       ListNode ans=null;
        while (fast!=null && slow!=null){
            if(fast==slow){
                ans=fast;
                return ans;

            }
            fast=fast.next;
            slow=slow.next;
        }
        return ans;

    }
}