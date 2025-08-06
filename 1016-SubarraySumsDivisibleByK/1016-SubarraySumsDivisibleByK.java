// Last updated: 8/6/2025, 11:02:53 AM
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int sum = 0;
        int[] freq = new int[k];
        freq[0] = 1;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int r = (int) (sum % k);
            if (r < 0) {
                r += k;
            }
            freq[r]++;
        }
        int ans = 0;
        for (int i = 0; i < k; i++) {
            if (freq[i] >= 2) {
                ans += (freq[i] * (freq[i] - 1)) / 2;
            }
        }
        return ans;
    }
}