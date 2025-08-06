// Last updated: 8/6/2025, 11:05:29 AM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(st.isEmpty() && (s.charAt(i) == ')' || s.charAt(i) == '}' || s.charAt(i) == ']')) {
                return false;
            }
            if(ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
                continue;
            }
            char ch1 = st.peek();
            if((ch1 == '(' && ch == ')') || (ch1 == '{' && ch == '}') || (ch1 == '[' && ch == ']')) {
                st.pop();
            } else {
                return false;
            }
        }
        return st.isEmpty();
    }
}