// Last updated: 8/6/2025, 11:04:48 AM
class Solution {
    public void sortColors(int[] nums) {
        int[] f = {0, 0, 0};
        for(int i = 0; i < nums.length; i++) {
            f[nums[i]] += 1;
        } int c = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < f[i]; j++) {
                nums[c] = i;
                c++;
            }       
        }
    }
}