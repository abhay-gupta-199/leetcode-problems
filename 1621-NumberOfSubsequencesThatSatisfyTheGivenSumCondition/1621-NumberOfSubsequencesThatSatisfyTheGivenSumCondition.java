// Last updated: 8/6/2025, 11:02:25 AM
class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int mod = 1_000_000_007;
        int n = nums.length;

        int[] pow2 = new int[n];
        pow2[0] = 1;
        for (int i = 1; i < n; i++) {
            pow2[i] = (pow2[i - 1] * 2) % mod;
        }

        int left = 0, right = n - 1;
        int res = 0;

        while (left <= right) {
            if (nums[left] + nums[right] <= target) {
                res = (res + pow2[right - left]) % mod;
                left++;
            } else {
                right--;
            }
        }

        return res;
    }
}