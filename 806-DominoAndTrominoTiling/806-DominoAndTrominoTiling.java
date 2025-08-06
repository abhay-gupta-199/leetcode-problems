// Last updated: 8/6/2025, 11:03:11 AM
class Solution {
    public int numTilings(int n) {
        int mod = 1000000007;
        if(n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 5;
        for(int i = 4; i <= n; i++) {
            dp[i] = (int) ((2L * dp[i-1] + dp[i-3]) % mod);
        }
        return dp[n];
    }
}