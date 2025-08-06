// Last updated: 8/6/2025, 11:01:19 AM
class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        for (int x : nums) {
            max = Math.max(max, x);
        }

        int curr = 0, res = 0;
        for (int x : nums) {
            if (x == max) {
                curr++;
                res = Math.max(res, curr);
            } else {
                curr = 0;
            }
        }

        return res;
    }
}