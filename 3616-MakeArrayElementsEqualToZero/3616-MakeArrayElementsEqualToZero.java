// Last updated: 11/19/2025, 2:59:09 PM
class Solution {
    public int countValidSelections(int[] nums) {
        int n = nums.length;
        int res = 0, l = 0, r = 0;
        for(int x : nums) r += x;

        for(int x : nums) {
            l += x;
            r -= x;

            if(x != 0) continue;
            if(l == r) res += 2;
            if(l - r == 1 || r - l == 1) res++;
        }
        return res;
    }
}