// Last updated: 8/6/2025, 11:03:57 AM
class Solution {
    public void moveZeroes(int[] nums) {
        int c = 0;
        for (int x : nums) {
            if(x != 0) {
                nums[c++] = x;
            }
        }
        for(int i = c; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}