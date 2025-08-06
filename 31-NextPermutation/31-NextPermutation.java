// Last updated: 8/6/2025, 11:05:17 AM
class Solution {
    public void nextPermutation(int[] nums) {
        int l = -1, r = -1, n = nums.length;
        for(int i = n - 2; i >= 0; i--) {
            if(nums[i] < nums[i+1]) {
                l = i;
                break;
            }
        }
        
        if(l < 0) {
            reverse(nums, 0);
            return;
        }

        for(int i = n - 1; i > l; i--) {
            if(nums[i] > nums[l]) {
                r = i;
                break;
            }
        }

        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;

        reverse(nums, l+1);
    }

    private void reverse(int[] nums, int l) {
        int r = nums.length - 1;
        while(l < r) {
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}