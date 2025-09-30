// Last updated: 9/30/2025, 11:59:32 PM
class Solution {
    public int triangularSum(int[] nums) {
        int r = nums.length - 1;
        while(r > 0) {
            for(int i = 0; i < r; i++) {
                nums[i] = (nums[i] + nums[i+1]) % 10;
            }
            r--;
        }
        return nums[0];
    }
}