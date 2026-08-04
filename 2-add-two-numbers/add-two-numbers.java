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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1=l1;
        ListNode temp2=l2;
        ListNode head=null;
        ListNode tail=null;
        int flor=0;
        while(temp1!=null && temp2!=null){
            int sum=0;
            int currtMax=temp1.val+temp2.val;
            if(flor!=0) currtMax+=flor;
            if(currtMax>9){
                sum=currtMax%10;
                flor=currtMax/10;
            }
            else{
                sum=currtMax;
                flor=0;
            }
           temp1=temp1.next;
           temp2=temp2.next;
           ListNode t=new ListNode(sum);
           if(head==null){
            head=t;
            tail=t;
           }
           else{
            tail.next=t;
            tail=t;
           }
        }
          while(temp1!=null){
            int sum=0;
            int currtMax=temp1.val;
            if(flor!=0) currtMax+=flor;
            if(currtMax>9){
                sum=currtMax%10;
                flor=currtMax/10;
            }
            else{
                sum=currtMax;
                flor=0;
            }
            temp1=temp1.next;
            ListNode t=new ListNode(sum);
           if(head==null){
            head=t;
            tail=t;
           }
           else{
            tail.next=t;
            tail=t;
           }
           
        }
          while( temp2!=null){
            int sum=0;
            int currtMax=temp2.val;
            if(flor!=0) currtMax+=flor;
            if(currtMax>9){
                sum=currtMax%10;
                flor=currtMax/10;
            }
            else{
                sum=currtMax;
                flor=0;
            }
            temp2=temp2.next;
            ListNode t=new ListNode(sum);
           if(head==null){
            head=t;
            tail=t;
           }
           else{
            tail.next=t;
            tail=t;
           }
        }
        if(flor!=0){
            ListNode t=new ListNode(flor);
           if(head==null){
            head=t;
            tail=t;
           }
           else{
            tail.next=t;
            tail=t;
           }
        }
        return head;
    }
}