// Last updated: 8/6/2025, 11:05:55 AM
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
        ListNode dummy = new ListNode();
        ListNode temp = dummy;
        int c = 0;
        while(l1 != null || l2 != null || c != 0) {
            int a = (l1 == null) ? 0 : l1.val;
            int b = (l2 == null) ? 0 : l2.val;
            int sum = a + b + c;
            c = sum / 10;
            ListNode newNode = new ListNode(sum % 10);
            temp.next = newNode;
            temp = temp.next;
            l1 = (l1 != null) ? l1.next : null;
            l2 = (l2 != null) ? l2.next : null;
        }
        return dummy.next;
    }
}