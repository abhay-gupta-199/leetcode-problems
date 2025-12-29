// Last updated: 12/29/2025, 11:34:45 PM
1class Solution {
2    public String removeSubstring(String s, int k) {
3        String temp = s;
4        StringBuilder sb = new StringBuilder();
5        int count = 0;
6        for(char ch : temp.toCharArray()) {
7            sb.append(ch);
8            if(ch == '(') {
9                count++;
10            } else {
11                if(count >= k && sb.length() >= 2 * k) {
12                    int len = sb.length();
13                    boolean b = true;
14                    for(int i = len - 2 * k; i < len - k; i++) {
15                        if(sb.charAt(i) != '(') {
16                            b = false;
17                            break;
18                        }
19                    }
20                    for(int i = len - k; i < len; i++) {
21                        if(sb.charAt(i) != ')') {
22                            b = false;
23                            break;
24                        }
25                    }
26                    if(b) {
27                        sb.delete(sb.length() - 2 * k, sb.length());
28                        count -= k;
29                    }
30                }
31            }
32        }
33        return sb.toString();
34    }
35}