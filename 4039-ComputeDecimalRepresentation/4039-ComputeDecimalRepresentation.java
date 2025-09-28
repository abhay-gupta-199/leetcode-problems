// Last updated: 9/28/2025, 10:27:45 PM
class Solution {
    public int[] decimalRepresentation(int x) {
        Stack<Integer> st = new Stack<>();
        int e = 1;
        while(x > 0) {
            int d = x % 10;
            x /= 10;
            if(d != 0) st.push(d * e);
            e *= 10;
        }
        int n = st.size();
        int[] res = new int[n];
        for(int i = 0; i < n; i++) {
            res[i] = st.pop();
        }
        return res;
    }
}