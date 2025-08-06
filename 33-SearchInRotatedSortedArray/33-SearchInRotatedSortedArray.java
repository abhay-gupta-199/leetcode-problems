// Last updated: 8/6/2025, 11:05:13 AM
class Solution {
    public int search(int[] nums, int target) {
        int l = 0, h = nums.length-1;
        while(l <= h) {
            int m = l + (h-l) / 2;

            if(nums[m] == target) return m;

            if(nums[l] <= nums[m]) {
                if(nums[l] <= target && target < nums[m]) h = m - 1;
                else l = m + 1;
            } else {
                if(nums[h] >= target && target > nums[m]) l = m + 1;
                else h = m - 1;
            }
        }
        return -1;
    }
}