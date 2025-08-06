// Last updated: 8/6/2025, 11:01:55 AM
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int max = 0;
        for(int x : nums) max |= x;
        int[] res = new int[1];
        backtrack(nums, 0, 0, max, res);
        return res[0];
    }

    private void backtrack(int[] nums, int idx, int curr, int max, int[] res) {
        if(curr == max) res[0]++;
        for(int i = idx; i < nums.length; i++) {
            backtrack(nums, i+1, curr | nums[i], max, res);
        }
    }
}