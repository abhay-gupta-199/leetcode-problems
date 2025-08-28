// Last updated: 8/28/2025, 12:03:42 PM
class Solution {
    public long perfectPairs(int[] nums) {
        int n = nums.length;
        long res_cnt = 0;
        long[] ar = new long[n];
        for(int i = 0; i < n; i++) {
            ar[i] = Math.abs((long) nums[i]);
        }
        Arrays.sort(ar);
        int k = 0;
        for(int i = 0; i < n; i++) {
            if(k < i) k = i;
            while(k + 1 < n && ar[k + 1] <= 2L * ar[i]) k++;
            res_cnt += k - i;
        }
        return res_cnt;
    }
}