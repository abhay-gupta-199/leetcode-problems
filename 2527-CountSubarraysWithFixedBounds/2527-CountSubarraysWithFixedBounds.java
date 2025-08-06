// Last updated: 8/6/2025, 11:01:16 AM
class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long c = 0;
        int l = -1, min = -1, max = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < minK || nums[i] > maxK) l = i;
            if(nums[i] == maxK) max = i;
            if(nums[i] == minK) min = i;
            c += Math.max(0, Math.min(min, max) - l);
        }
        return c;
    }
}