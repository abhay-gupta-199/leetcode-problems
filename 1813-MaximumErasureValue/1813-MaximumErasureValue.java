// Last updated: 8/6/2025, 11:02:22 AM
class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum = 0, res = 0;
        Set<Integer> set = new HashSet<>();
        int left = 0;
        for(int i = 0; i < nums.length; i++) {
            int val = nums[i];
            while(set.contains(val)) {
                set.remove(nums[left]);
                sum -= nums[left];
                left++;
            }
            set.add(val);
            sum += val;
            res = Math.max(res, sum);
        }
        return res;
    }
}