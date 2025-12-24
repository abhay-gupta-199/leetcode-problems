// Last updated: 12/24/2025, 10:50:35 PM
1class Solution {
2    public int findMinimumOperations(String s1, String s2, String s3) {
3        int len = Math.min(s1.length(), Math.min(s2.length(), s3.length()));
4        int sum = s1.length() + s2.length() + s3.length();
5        
6        if (s1.charAt(0) != s2.charAt(0) || s1.charAt(0) != s3.charAt(0) || s2.charAt(0) != s3.charAt(0)) {
7            return -1;
8        }
9
10        for (int i = 0; i < len; i++) {
11            if (s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
12                sum -= 3;
13            } else {
14                break;
15            }
16        }
17
18        return sum;
19    }
20}