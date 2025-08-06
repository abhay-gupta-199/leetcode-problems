// Last updated: 8/6/2025, 11:03:15 AM
class Solution {
    public boolean isIdealPermutation(int[] nums) {
        for(int i = 0; i < nums.length; i++) {
            if(i - nums[i] > 1 || i - nums[i] < -1) return false;
        }
        return true;
    }
}