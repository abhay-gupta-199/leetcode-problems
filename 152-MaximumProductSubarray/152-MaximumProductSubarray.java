// Last updated: 8/6/2025, 11:04:21 AM
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 0) return 0;
        int min = 1, max = 1, res = nums[0];

        for(int num : nums) {
            int temp = Math.max(num, Math.max(max * num, min * num));
            min = Math.min(num, Math.min(max * num, min * num));
            max = temp;

            res = Math.max(res, max);
        }

        return res;
    }
}