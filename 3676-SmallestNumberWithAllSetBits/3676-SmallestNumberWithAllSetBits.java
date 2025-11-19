// Last updated: 11/19/2025, 2:58:58 PM
class Solution {
    public int smallestNumber(int n) {
        int x = 0;
        while(n > 0) {
            n /= 2;
            x++;
        }
        int res = (int) Math.pow(2, x) - 1;
        return res;
    }
}