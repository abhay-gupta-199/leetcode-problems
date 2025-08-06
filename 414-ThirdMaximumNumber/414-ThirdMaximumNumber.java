// Last updated: 8/6/2025, 11:03:41 AM
import java.lang.*;
class Solution {
    public int thirdMax(int[] nums) {
        long max1 = Long.MIN_VALUE;
        long max2 = Long.MIN_VALUE;
        long max3 = Long.MIN_VALUE;
        for(int x : nums) {
            if(x > max1) {
                max3 = max2;
                max2 = max1;
                max1 = x;
            } else if(x > max2 && x < max1) {
                max3 = max2;
                max2 = x;
            } else if(x > max3 && x < max2) {
                max3 = x;
            }
        }
        return max3 == Long.MIN_VALUE ? (int) max1 : (int) max3;
    
        // Arrays.sort(nums);
        // int l = nums.length;
        // int c = 1;
        // for(int i = l-2; i >= 0; i--) {
        //     if(nums[i] != nums[i+1]) c++;
        //     if(c == 3) return nums[i];
        // }
        // return nums[l-1];
    }
}