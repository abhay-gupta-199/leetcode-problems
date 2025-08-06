// Last updated: 8/6/2025, 11:02:46 AM
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
    public int[] nextLargerNodes(ListNode head) {
        List<Integer> l = new ArrayList<>();
        ListNode temp = head;
        int n = 0;
        while(temp != null) {
            n++;
            l.add(temp.val);
            temp = temp.next;
        }
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < n; i++) {
            int val = l.get(i);
            while(!st.isEmpty() && val > l.get(st.peek())) {
                res[st.pop()] = val;
            }
            st.push(i);
        }
        return res;
    }
}