// Last updated: 8/6/2025, 11:03:23 AM
class Solution {
    public List<Integer> findClosestElements(int[] nums, int k, int x) {
        int l = 0, h = nums.length - 1;
        while(h - l >= k) {
            if(Math.abs(nums[l] - x) > Math.abs(nums[h] - x))
                l++;
            else
                h--;
        }
        List<Integer> ll = new ArrayList<Integer>();
        for(int i = l; i <= h; i++) {
            ll.add(nums[i]);
        }
        return ll;
    }
}