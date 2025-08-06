// Last updated: 8/6/2025, 11:02:38 AM
class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int x : nums) {
            if(Math.floor(Math.log10(x)) % 2 != 0) {
                c++;
            }
        }
        return c;
    }
}