// Last updated: 8/6/2025, 11:00:17 AM
class Solution {
    private boolean isZeroArray(int[] nums, int[][] queries, int k) {
        int n = nums.length;
        int[] diff = new int[n+1];
        for(int i = 0; i < k; i++) {
            int li = queries[i][0];
            int ri = queries[i][1];
            int val = queries[i][2];

            diff[li] += val;
            diff[ri + 1] -= val;
        }

        int cumSum = 0;
        for(int i = 0; i < n; i++) {
            cumSum += diff[i];
            if(cumSum < nums[i]) return false;
        }
        return true;
    }

    public int minZeroArray(int[] nums, int[][] queries) {
        int l = 0, h = queries.length;
        if(!isZeroArray(nums, queries, h)) return -1;

        while(l <= h) {
            int k = l + (h-l)/2;
            if(isZeroArray(nums, queries, k)) {
                h = k - 1;
            } else {
                l = k + 1;
            }
        }
        return l;
    }
}