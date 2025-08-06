// Last updated: 8/6/2025, 11:01:25 AM
class Solution {
    public String smallestNumber(String s) {
        int[] ar = new int[s.length() + 1];
        int c = 1;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i <= s.length(); i++) {
            if(i == s.length() || s.charAt(i) == 'I') {
                ar[i] = c;
                c++;
                while(!stack.isEmpty()) {
                    ar[stack.pop()] = c;
                    c++;
                }
            } else {
                stack.push(i);
            }
        }
        String ans = "";
        for(int v : ar) {
            ans += v;
        }
        return ans;
    }
}