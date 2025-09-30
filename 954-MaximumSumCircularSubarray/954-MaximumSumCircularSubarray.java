// Last updated: 10/1/2025, 12:00:47 AM
class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int x : nums) {
            sum += x;
            maxSum = Math.max(maxSum, sum);
            if(sum < 0) sum = 0;
        }

        sum = 0;
        int minSum = 0;
        for(int x : nums) {
            sum += x;
            minSum = Math.min(minSum, sum);
            if(sum > 0) sum = 0;
        }
        
        int total = 0;
        int max = Integer.MIN_VALUE;
        for(int x : nums) {
            total += x;
            max = Math.max(max, x);
        }

        int res = Math.max(maxSum, total - minSum);

        return (res == 0) ? max : res;
    }
}