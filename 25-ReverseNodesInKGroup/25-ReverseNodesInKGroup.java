// Last updated: 8/6/2025, 11:05:23 AM
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
        ListNode temp = head, prev = null, next = null;;
        while(temp != null) {
            ListNode kth = kthNode(temp, k);
            if(kth == null) {
                if(prev != null) prev.next = temp;
                break;
            }
            next = kth.next;
            kth.next = null;
            reverseLL(temp);
            if(temp == head) head = kth;
            else prev.next = kth;
            prev = temp;
            temp = next;
        }
        return head;
    }

    public static ListNode reverseLL(ListNode head) {
        ListNode temp = head, prev = null, next;
        while(temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    } 

    public static ListNode kthNode(ListNode temp, int k) {
        while(temp != null && k > 1) {
            temp = temp.next;
            k--;
        }
        return temp;
    }
}