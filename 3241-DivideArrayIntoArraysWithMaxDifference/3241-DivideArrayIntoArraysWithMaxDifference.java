// Last updated: 8/6/2025, 11:00:51 AM
class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int n = nums.length;
        int[][] res = new int[n/3][3];
        Arrays.sort(nums);
        int x = 0;
        
        for(int i = 0; i < n; i += 3) {
            if(i+2 >= n || nums[i+2] - nums[i] > k) {
                return new int[0][0];
            }
            res[x][0] = nums[i];
            res[x][1] = nums[i+1];
            res[x++][2] = nums[i+2];
        }

        return res;
    }
}