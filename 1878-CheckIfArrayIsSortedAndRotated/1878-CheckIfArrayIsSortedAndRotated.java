// Last updated: 8/6/2025, 11:02:17 AM
class Solution {
    public boolean check(int[] nums) {
        int n = nums.length, occ = 0;
        for(int i = 1; i < n; i++) {
            if(nums[i] < nums[i-1]) {
                occ++;
                if(occ > 1) return false;
                if(nums[0] < nums[n - 1]) return false;
            }
        }
        return true;
    }
}