// Last updated: 8/6/2025, 11:01:58 AM
class Solution {
    public int maximumDifference(int[] nums) {
        int res = -1;
        int min = nums[0];

        for(int i = 1; i < nums.length; i++) {
            if(min < nums[i] && nums[i] - min > res) {
                res = nums[i] - min;
            }
            if(nums[i] < min) min = nums[i];
        }

        return res;
    }
}