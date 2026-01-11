// Last updated: 1/11/2026, 6:12:29 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        int m = matrix.length;
4        int n = matrix[0].length;
5        int res = 0;
6        int[] dp = new int[n];
7        for(int i = 0; i < m; i++) {
8            
9            for(int j = 0; j < n; j++) {
10                if(matrix[i][j] == '0') dp[j] = 0;
11                else dp[j]++;
12            }
13            res = Math.max(res, largestArea(dp));
14        }
15        return res;
16    }
17
18    int largestArea(int[] dp) {
19        Stack<Integer> st = new Stack<>();
20        int res = 0;
21        for(int i = 0; i < dp.length; i++) {
22            while(!st.isEmpty() && dp[i] < dp[st.peek()]) {
23                int h = dp[st.pop()];
24
25                if(st.isEmpty()) {
26                    res = Math.max(res, h * i);
27                } else {
28                    res = Math.max(res, h * (i - st.peek() - 1));
29                }
30            }
31            st.push(i);
32        }
33        int r = dp.length;
34        while(!st.isEmpty()) {
35            int h = dp[st.pop()];
36
37            if(st.isEmpty()) {
38                res = Math.max(res, h * r);
39            } else {
40                res = Math.max(res, h * (r - st.peek() - 1));
41            }
42        }
43        return res;
44    }
45}