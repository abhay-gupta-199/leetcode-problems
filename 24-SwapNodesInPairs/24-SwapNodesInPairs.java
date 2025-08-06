// Last updated: 8/6/2025, 11:05:24 AM
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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode temp = head, back = null, front = null;
        while(temp != null && temp.next != null) {
            front = temp.next;
            temp.next = front.next;
            front.next = temp;
            if(temp == head) head = front;
            else back.next = front;
            back = temp;
            temp = temp.next;
        }
        return head;
    }
}