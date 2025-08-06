// Last updated: 8/6/2025, 11:04:25 AM
class Solution {
    public int singleNumber(int[] nums) {
        int x = 0;
        for(int i = 0; i < nums.length; i++) {
            x ^= nums[i];
        }
        return x;
        // Arrays.sort(nums);
        // int i;
        // for(i = 0; i < nums.length - 1; i++) {
        //     if(nums[i] == nums[i+1]) i++;
        //     else return nums[i];
        // }
        // return nums[i];
    }
}