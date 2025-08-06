// Last updated: 8/6/2025, 11:01:31 AM
class Solution {
    public int longestSubsequence(String s, int k) {
        int bits = (int) (Math.log(k) / Math.log(2)) + 1;
        int sum = 0;
        int res = 0;

        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - i - 1);
            if(ch == '1') {
                if(i < bits && sum + (1 << i) <= k) {
                    sum += 1 << i;
                    res++;
                }
            } else {
                res++;
            }
        }
        return res;
    }
}