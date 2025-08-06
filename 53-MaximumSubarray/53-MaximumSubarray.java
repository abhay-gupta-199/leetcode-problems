// Last updated: 8/6/2025, 11:04:59 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int ans = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            ans = ans > sum ? ans : sum;
            if(sum < 0) sum = 0;
        } return ans;
    }
}