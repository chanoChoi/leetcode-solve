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
    ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        reverse(head);
        return newHead;
    }
    
    private ListNode reverse(ListNode head) {
        if (head.next == null) {
            newHead = head;
            return head;
        }
        ListNode tmp = reverse(head.next);
        tmp.next = head;
        head.next = null;
        return head;
    }
}