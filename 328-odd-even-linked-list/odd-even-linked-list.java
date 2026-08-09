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
    public ListNode oddEvenList(ListNode head) {
        ListNode oddl=new ListNode(1010);
        ListNode evenl=new ListNode(3747);
        ListNode odd=oddl;
        ListNode even=evenl;
        ListNode temp=head;
        while(temp!=null){
            odd.next=temp;
            odd=temp;
            temp=temp.next;
            even.next=temp;
            if(temp==null) break;
            even=temp;
            temp=temp.next;
        }
        evenl=evenl.next;
        oddl=oddl.next;
        odd.next=evenl;
        return oddl;
    }
}