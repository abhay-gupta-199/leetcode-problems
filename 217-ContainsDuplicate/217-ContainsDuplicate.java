// Last updated: 8/6/2025, 11:04:12 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i < nums.length-1; i++) {
            if(nums[i] == nums[i+1])
                return true;
        } return false;
    }
}
