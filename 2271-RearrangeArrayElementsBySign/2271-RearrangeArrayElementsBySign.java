// Last updated: 8/6/2025, 11:01:40 AM
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];
        int pos = 0, neg = 1;
        for(int val : nums) {
            if(val < 0) {
                res[neg] = val;
                neg += 2;
            } else {
                res[pos] = val;
                pos += 2;
            }
        }
        return res;
    }
}