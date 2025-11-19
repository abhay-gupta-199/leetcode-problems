// Last updated: 11/19/2025, 2:59:14 PM
class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int prev = nums[0], x = 0;
        int[] res = new int[2];
        for(int i = 1; i < n; i++) {
            if(nums[i] == prev) {
                res[x++] = nums[i]; 
            }
            prev = nums[i];
        }
        return res;
    }
}