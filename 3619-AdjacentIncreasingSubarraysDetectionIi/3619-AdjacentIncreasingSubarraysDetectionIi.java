// Last updated: 10/16/2025, 10:23:06 AM
class Solution {
    public int maxIncreasingSubarrays(List<Integer> nums) {
        int n = nums.size();
        int curr = 1, prev = 0, res = 1;
        for(int i = 1; i < n; i++) {
            if(nums.get(i) > nums.get(i-1)) {
                curr++;
            } else {
                prev = curr;
                curr = 1;
            }
            res = Math.max(res, Math.min(prev, curr));
            res = Math.max(res, curr/2);
        }
        return res;
    }
}