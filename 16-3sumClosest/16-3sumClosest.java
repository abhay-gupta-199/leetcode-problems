// Last updated: 8/6/2025, 11:05:35 AM
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length, res = 0, diff = Integer.MAX_VALUE;
        
        for(int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int newDiff = Math.abs(sum - target);
                if(newDiff < diff) {
                    diff = newDiff;
                    res = sum;
                }
                if(sum < target) {
                    j++;
                } else if(sum > target) {
                    k--;
                } else {
                    break;
                }
            }
        }
        return res;
    }
}