// Last updated: 8/6/2025, 11:00:40 AM
class Solution {
    public boolean[] isArraySpecial(int[] nums, int[][] queries) {
        int n = nums.length;
        int q = queries.length;
        boolean[] res = new boolean[q];

        for(int i = 0; i < n; i++) {
            nums[i] = nums[i] & 1;
        }

        int[] ps = new int[n];
        for(int i = 1; i < n; i++) {
            ps[i] = ps[i-1];
            if(nums[i] == nums[i-1]) ps[i]++;
        }

        for(int i = 0; i < q; i++) {
            int l = queries[i][0];
            int r = queries[i][1];
            res[i] = ps[l] == ps[r];
        }
        return res;
    }
}