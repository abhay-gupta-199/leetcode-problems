// Last updated: 8/28/2025, 12:15:19 PM
class Solution {
    public int longestSubarray(int[] nums) {
        int res = 0;
        int l = 0, prev = 0, curr = 0;
        for(int x : nums) {
            if(x == 1) {
                curr++;
            } else {
                res = Math.max(res, prev + curr);
                prev = curr;
                curr = 0;
            }
        }
        res = Math.max(res, prev + curr);

        if(res == nums.length) return res - 1;
        return res;
    }
}