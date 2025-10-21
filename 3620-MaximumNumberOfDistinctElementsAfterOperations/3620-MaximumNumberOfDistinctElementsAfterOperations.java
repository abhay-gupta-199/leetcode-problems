// Last updated: 10/21/2025, 10:57:27 PM
class Solution {
    public int maxDistinctElements(int[] nums, int k) {
        Arrays.sort(nums);
        int prev = Integer.MIN_VALUE;
        int res = 0;

        for(int x : nums) {
            int curr = Math.min(Math.max(prev + 1, x - k), x + k);
            if(curr > prev) {
                res++;
                prev = curr;
            }
        }
        return res;
    }
}