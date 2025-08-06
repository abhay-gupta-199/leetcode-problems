// Last updated: 8/6/2025, 11:03:42 AM
class Solution {
    public String decodeString(String s) {
        Stack<Integer> st = new Stack<>();
        Stack <StringBuilder> sb = new Stack<>();
        StringBuilder res = new StringBuilder();
        int n = 0;

        for(char ch : s.toCharArray()) {
            if(Character.isDigit(ch)) {
                n = n * 10 + ch - '0';
            } else if(ch == '[') {
                st.push(n);
                sb.push(res);
                n = 0;
                res = new StringBuilder();
            } else if(ch == ']') {
                int k = st.pop();
                StringBuilder tem = res;
                res = sb.pop();
                while(k-- > 0) {
                    res.append(tem);
                }
            } else {
                res.append(ch);
            }
        }
        return res.toString();
    }
}