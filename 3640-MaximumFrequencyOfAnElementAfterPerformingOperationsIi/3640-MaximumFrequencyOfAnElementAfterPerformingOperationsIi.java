// Last updated: 11/19/2025, 2:59:01 PM
class Solution {
    public int maxFrequency(int[] nums, int k, int ops) {
        Arrays.sort(nums);
        int n = nums.length;
        int res = 0;
        int i = 0, left = 0, right = 0;

        while (i < n) {
            int val = nums[i];
            int same = 0;
            while (i < n && nums[i] == val) {
                same++;
                i++;
            }
            while (right < n && nums[right] <= val + k) {
                right++;
            }
            while (left < n && nums[left] < val - k) {
                left++;
            }
            res = Math.max(res, Math.min(same + ops, right - left));
        }

        left = 0;
        right = 0;
        while (right < n) {
            while (right < n && (long) nums[left] + k + k >= nums[right]) {
                right++;
            }
            res = Math.max(res, Math.min(right - left, ops));
            left++;
        }
        return res;
    }
}