// Last updated: 11/19/2025, 2:58:47 PM
class Solution {
    public int minOperations(int[] nums) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int x : nums) {
            while(!st.isEmpty() && st.peek() > x) {
                st.pop();
            }
            if(x == 0) continue;
            if(st.isEmpty() || st.peek() < x) {
                res++;
                st.push(x);
            }
        }
        return res;
    }
}