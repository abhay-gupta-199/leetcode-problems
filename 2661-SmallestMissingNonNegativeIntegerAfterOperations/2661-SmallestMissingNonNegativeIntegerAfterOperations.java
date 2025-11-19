// Last updated: 11/19/2025, 2:59:39 PM
class Solution {
    public int findSmallestInteger(int[] nums, int val) {
        int n = nums.length, res = 0;
        int[] a = new int[val];

        for(int x : nums) {
            a[(x % val + val) % val]++;
        }
        while(a[res % val]-- > 0) {
            res++;
        }
        return res;
    }
}