// Last updated: 8/6/2025, 11:00:34 AM
class Solution {
    public int maximumLength(int[] nums, int k) {
        int[][] dp = new int[k][k];
        int res = 0;

        for(int x : nums) {
            int curr = x % k;
            for(int i = 0; i < k; i++) {
                dp[i][curr] = dp[curr][i] + 1;
                res = Math.max(res, dp[i][curr]);
            }
        }

        return res;
    }
}