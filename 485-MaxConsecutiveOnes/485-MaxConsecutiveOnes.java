// Last updated: 8/6/2025, 11:03:31 AM
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, ans = 0;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                count++;
            } else {
                ans = Math.max(ans, count);
                count = 0;
            }
        }
        ans = Math.max(ans, count);
        return ans;
    }
}