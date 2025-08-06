// Last updated: 8/6/2025, 11:01:33 AM
class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt = 0, sum = 0;
        int l = 0;
        for(int r = 0; r < nums.length; r++) {
            sum += nums[r];
            while(sum * (r-l+1) >= k) {
                sum -= nums[l++];
            }
            cnt += r-l+1;
        }
        return cnt;
    }
}