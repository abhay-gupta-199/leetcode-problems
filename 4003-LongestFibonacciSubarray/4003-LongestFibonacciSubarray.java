// Last updated: 10/13/2025, 10:17:34 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int cnt = 2, res = 2;

        for(int i = 0; i < n-2; i++) {
            if(nums[i] + nums[i+1] == nums[i+2]) {
                cnt++;
            } else {
                res = Math.max(res, cnt);
                cnt = 2;
            }
        }
        res = Math.max(res, cnt);
        return res;
    }
}