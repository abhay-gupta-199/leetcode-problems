// Last updated: 4/8/2026, 4:34:30 PM
1class Solution {
2    long MOD = 1_000_000_007; 
3    public int xorAfterQueries(int[] nums, int[][] queries) {
4        for(int[] q : queries) {
5            int li = q[0], ri = q[1], ki = q[2], vi = q[3];
6            int idx = li;
7            while(idx <= ri) {
8                nums[idx] = (int) ((nums[idx] * 1L * vi) % MOD);
9                idx += ki;
10            }
11        }
12
13        int ans = 0;
14        for(int x : nums) ans ^= x;
15        return ans;
16    }
17}