// Last updated: 9/28/2025, 10:27:43 PM
class Solution {
    public int climbStairs(int n, int[] costs) {
        if(n == 0) return 0;
        int[] dp = new int[n+1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;

        for(int i = 1; i <= n; i++) {
            int cost = costs[i-1];
            for(int j = 1; j <= 3; j++) {
                int k = i - j;
                if(k < 0) break;
                int x = dp[k] + cost + j * j;
                if(x < dp[i]) dp[i] = x;
            }
        }
        return dp[n];
    }
}