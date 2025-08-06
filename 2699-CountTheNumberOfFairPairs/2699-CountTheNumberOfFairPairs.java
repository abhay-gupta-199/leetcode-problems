// Last updated: 8/6/2025, 11:01:13 AM
class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return count(nums, upper) - count(nums, lower - 1);
    }

    public static long count(int[] nums, long x) {
        long res = 0;
        int j = nums.length - 1;
        for(int i = 0; i < j; i++) {
            while(i < j && nums[i] + nums[j] > x) {
                j--;
            }
            res += j - i;
        }
        return res;
    }
}