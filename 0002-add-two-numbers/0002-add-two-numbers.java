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
        // StringBuilder sb = new StringBuilder();
        ListNode res = new ListNode(0);
        ListNode curr = res;
        int up = 0;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + up;
            up = 0;
            if (sum >= 10) {
                up = 1;
                sum = sum % 10;
            }
            l1 = l1.next;
            l2 = l2.next;
            curr.next = new ListNode(sum);
            curr = curr.next;
        }
        
            while (l2 != null) {
                int sum =  l2.val + up;
            up = 0;
            if (sum >= 10) {
                up = 1;
                sum = sum % 10;
            }
            l2 = l2.next;
            curr.next = new ListNode(sum);
            curr = curr.next;
            }
        
             while (l1 != null) {
                int sum =  l1.val + up;
            up = 0;
            if (sum >= 10) {
                up = 1;
                sum = sum % 10;
            }
            l1 = l1.next;
            curr.next = new ListNode(sum);
            curr = curr.next;
            }
        
            curr.next = up == 1 ? new ListNode(up) : null;
            
        return res.next;
    }
}