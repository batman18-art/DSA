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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp=new ListNode(10000);
        // temp.val=10000;
        ListNode ptr1=temp;
        ListNode ptr2=list1;
        ListNode ptr3=list2;
        while(ptr2!=null && ptr3!=null){
            if(ptr2.val>ptr3.val){
               ptr1.next=ptr3;
               ptr1=ptr3;
               ptr3=ptr3.next;
            }
            else{
            ptr1.next=ptr2;
            ptr1=ptr2;
            ptr2=ptr2.next;
            }
            
        }
        while(ptr2!=null){
            ptr1.next=ptr2;
            ptr1=ptr2;
            ptr2=ptr2.next;
        }
        while(ptr3!=null){
            ptr1.next=ptr3;
            ptr1=ptr3;
            ptr3=ptr3.next;
        }
        return temp.next;
    }
}