// Last updated: 8/6/2025, 11:00:04 AM
class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n = nums.length;
        int res = Math.abs(nums[n-1] - nums[0]);

        for(int i = 0; i < n-1; i++) {
            res = Math.max(res, Math.abs(nums[i+1] - nums[i]));
        }

        return res;
    }
}