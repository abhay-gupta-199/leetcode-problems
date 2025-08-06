// Last updated: 8/6/2025, 11:01:37 AM
class Solution {
    public int countHillValley(int[] nums) {
        int n = nums.length;
        int res = 0;
        for(int i = 1; i < n-1; i++) {
            if(nums[i] == nums[i-1]) continue;
            int x = nums[i];
            int l = i - 1;
            while(l >= 0 && nums[l] == x) l--;
            int r = i + 1;
            while(r < n && nums[r] == x) r++;
            if(l >= 0 && r < n) {
                if(nums[l] < x && nums[r] < x) res++;
                if(nums[l] > x && nums[r] > x) res++;
            }
        }
        return res;
    }
}