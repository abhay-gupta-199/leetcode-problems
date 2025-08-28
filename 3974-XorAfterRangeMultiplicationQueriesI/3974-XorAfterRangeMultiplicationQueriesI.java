// Last updated: 8/28/2025, 12:03:40 PM
class Solution {
    long MOD = 1_000_000_007; 
    public int xorAfterQueries(int[] nums, int[][] queries) {
        for(int[] q : queries) {
            int li = q[0], ri = q[1], ki = q[2], vi = q[3];
            int idx = li;
            while(idx <= ri) {
                nums[idx] = (int) ((nums[idx] * 1L * vi) % MOD);
                idx += ki;
            }
        }

        int ans = 0;
        for(int x : nums) ans ^= x;
        return ans;
    }
}