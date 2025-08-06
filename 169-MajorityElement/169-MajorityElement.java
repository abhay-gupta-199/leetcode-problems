// Last updated: 8/6/2025, 11:04:18 AM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int e = nums[0];
        int v = 1;
        for(int i = 1; i < n; i++) {
            if(nums[i] == e)
                v++;
            else {
                v--;
                if(v == 0) {
                    e = nums[i];
                    v = 1;
                }
            }
        } return e;
    }
}