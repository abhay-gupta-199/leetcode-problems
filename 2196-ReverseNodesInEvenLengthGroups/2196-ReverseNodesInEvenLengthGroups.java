// Last updated: 8/6/2025, 11:01:52 AM
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
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode temp = head.next, prev = head, next = null;
        int k = 2;
        while(temp != null) {
            ListNode kth = kthNode(temp, k);
            if(kth == null) {
                int i = 1;
                ListNode kth2 = temp;
                while(kth2.next != null) {
                    kth2 = kth2.next;
                    i++;
                }
                if(i % 2 == 0) {
                    reverseLL(temp);
                    prev.next = kth2;
                    temp = temp.next;
                } else {
                    prev.next = temp;
                    temp = kth2.next;
                }
            } else if(k % 2 == 0) {
                next = kth.next;
                kth.next = null;
                reverseLL(temp);
                prev.next = kth;
                prev = temp;
                temp = next;
            } else {
                prev.next = temp;
                prev = kth;
                temp = kth.next;
            }
            k++;
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