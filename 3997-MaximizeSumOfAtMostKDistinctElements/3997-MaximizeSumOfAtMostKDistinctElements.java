// Last updated: 9/15/2025, 10:17:07 AM
class Solution {
    public int[] maxKDistinct(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        int prev = 0;
        for(int i = n-1; i >= 0; i--) {
            if(nums[i] != prev) {
                prev = nums[i];
                l.add(prev);
                k--;
            } 
            if(k == 0) break;
        } 
        int[] res = new int[l.size()];
        for(int i = 0; i < l.size(); i++) res[i] = l.get(i);
        return res;
    }
}