// Last updated: 8/6/2025, 11:00:08 AM
class Solution {
    public int countSubarrays(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length - 2; i++) {
            if((nums[i] + nums[i+2]) * 2 == nums[i+1]) c++;
        }
        return c;
    }
}