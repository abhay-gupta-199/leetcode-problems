// Last updated: 9/10/2025, 10:54:45 AM
class Solution {
    public int minOperations(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[0]) return 1;
        }
        return 0;
    }
}