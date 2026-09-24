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
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode groupPrev = dummy;

        while (true) {
            // Find the k-th node of this group; if fewer than k remain, stop
            ListNode kth = getKth(groupPrev, k);
            if (kth == null) break;

            ListNode groupNext = kth.next;

            // Reverse the group; the first node ends up pointing to groupNext
            ListNode prev = groupNext, curr = groupPrev.next;
            while (curr != groupNext) {
                ListNode tmp = curr.next;
                curr.next = prev;
                prev = curr;
                curr = tmp;
            }

            // Reconnect: old first node is now the group's tail
            ListNode newGroupPrev = groupPrev.next;
            groupPrev.next = kth;
            groupPrev = newGroupPrev;
        }
        return dummy.next;
    }

    private ListNode getKth(ListNode curr, int k) {
        while (curr != null && k > 0) {
            curr = curr.next;
            k--;
        }
        return curr;
    }
}