// Last updated: 8/6/2025, 11:04:02 AM
class Solution {
    public int missingNumber(int[] nums) {
        int sum = 0;
        int total_sum = (nums.length*(nums.length+1))/2;
        for(int x : nums) {
            sum += x;
        }
        return total_sum - sum;
    }
}