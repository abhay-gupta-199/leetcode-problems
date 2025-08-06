// Last updated: 8/6/2025, 11:05:56 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j = 0;
        for(i = 0; i < nums.length; i++) {
            for(j = i+1 ; j < nums.length; j++) {
                if(nums[i] + nums[j] == target)
                    return new int[] {i, j};
            }
        } return new int[] {i, j};
    }
}