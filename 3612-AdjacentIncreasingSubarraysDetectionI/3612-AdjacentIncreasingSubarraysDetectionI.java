// Last updated: 10/16/2025, 10:23:09 AM
class Solution {
    public boolean hasIncreasingSubarrays(List<Integer> nums, int k) {
        int n = nums.size();

        for(int i = 0; i <= n-2*k; i++) {
            if(solve(nums, k, i)) return true;
        }
        return false;
    }

    boolean solve(List<Integer> nums, int k, int idx) {
        for(int i = idx+1; i < idx+k; i++) {
            if(nums.get(i-1) >= nums.get(i) || nums.get(i+k-1) >= nums.get(i+k)) {
                return false;
            }
        }
        return true;
    }
}