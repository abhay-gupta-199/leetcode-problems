// Last updated: 8/6/2025, 11:03:50 AM
class Solution {
    public boolean isPerfectSquare(int num) {
        int l = 1, h = num;
        while(l <= h) {
            int m = l + (h-l)/2;
            if(m >= num / m) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        return l * l == num;
    }
}