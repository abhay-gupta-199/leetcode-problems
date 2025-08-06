// Last updated: 8/6/2025, 11:05:20 AM
class Solution {
    public int divide(int dividend, int divisor) {
        double res = (double) dividend / divisor;
        if(res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        return (int) res;
    }
}