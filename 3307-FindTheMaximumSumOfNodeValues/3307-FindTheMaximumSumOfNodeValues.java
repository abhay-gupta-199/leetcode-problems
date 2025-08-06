// Last updated: 8/6/2025, 11:00:46 AM
class Solution {
    public long maximumValueSum(int[] nums, int k, int[][] edges) {
        long[] dp = {0, Long.MIN_VALUE};
        for(int n : nums) {
            long c0 = dp[0] + n;
            long c1 = dp[1] + n;
            int x = n ^ k;
            dp = new long[]{Math.max(c0, dp[1] + x), Math.max(c1, dp[0] + x)};
        }
        return dp[0];
    }
}