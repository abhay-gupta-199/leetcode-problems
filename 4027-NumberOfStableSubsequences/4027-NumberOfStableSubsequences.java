// Last updated: 9/15/2025, 10:17:03 AM
class Solution {
    public int countStableSubsequences(int[] nums) {
        long mod = 1_000_000_007;
        long[] one = new long[2];
        long[] two = new long[2];

        for(int x : nums) {
            int p = x % 2;
            int q = 1 - p;
            
            long temp = (one[p] + one[q] + two[q] + 1) % mod;
            two[p] = (two[p] + one[p]) % mod;
            one[p] = temp;
        }

        return (int) ((one[0] + two[0] + one[1] + two[1]) % mod);
    }
}