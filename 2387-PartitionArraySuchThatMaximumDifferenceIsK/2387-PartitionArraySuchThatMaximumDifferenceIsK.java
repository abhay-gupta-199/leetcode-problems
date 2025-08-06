// Last updated: 8/6/2025, 11:01:34 AM
class Solution {
    public int partitionArray(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 1, l = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] - l > k) {
                res++;
                l = nums[i];
            }
        }
        return res;
    }
}