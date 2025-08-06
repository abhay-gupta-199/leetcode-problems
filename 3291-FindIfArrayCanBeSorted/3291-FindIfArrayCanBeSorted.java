// Last updated: 8/6/2025, 11:00:47 AM
class Solution {
    public boolean canSortArray(int[] nums) {
        short pmax = 0, cmax = (short) nums[0];
        byte pbits = (byte) Integer.bitCount(cmax);
        for(int x : nums) {
            byte cbits = (byte) Integer.bitCount(x);
            if(cbits == pbits) {
                if(x > cmax) cmax = (short) x;
            } else {
                pmax = cmax;
                cmax = (short) x;
                pbits = cbits;
            }
            if(x < pmax) return false;
        }
        return true;
    }
}