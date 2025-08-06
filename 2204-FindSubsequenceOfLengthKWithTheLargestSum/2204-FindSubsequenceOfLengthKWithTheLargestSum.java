// Last updated: 8/6/2025, 11:01:49 AM
class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int n = nums.length;
        boolean[] hash = new boolean[n];
        int prev = Integer.MAX_VALUE;
        for(int i = 1; i <= k; i++) {
            int max = Integer.MIN_VALUE;
            int maxIdx = -1;
            for(int j = 0; j < n; j++) {
                if(!hash[j] && nums[j] > max && nums[j] <= prev) {
                    max = nums[j];
                    maxIdx = j;
                }
            }
            hash[maxIdx] = true;
        }

        int[] res = new int[k];
        int x = 0;
        for(int i = 0; i < n; i++) {
            if(hash[i]) {
                res[x++] = nums[i];
            }
        }
        return res; 
    }
}