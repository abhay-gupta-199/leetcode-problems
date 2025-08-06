// Last updated: 8/6/2025, 11:00:52 AM
class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for(int x : nums) max = Math.max(max, x);
        long c = 0;
        int l = 0, maxC = 0, n = nums.length;

        for(int r = 0; r < n; r++) {
            if(nums[r] == max) maxC++;
            while(maxC == k) {
                c += n - r;
                if(nums[l] == max) maxC--;
                l++;
            }
        }
        return c;
    }
}