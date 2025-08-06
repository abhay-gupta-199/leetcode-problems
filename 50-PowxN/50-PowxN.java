// Last updated: 8/6/2025, 11:05:02 AM
class Solution {
    public double myPow(double x, int n) {
        if(n == 0) {
            return 1.0;
        }
        long nn = n;
        if(n < 0) {
            nn = -1 * (long) n;
            x = 1 / x;
        }
        if(nn % 2 == 0) {
            return myPow(x * x, (int) (nn / 2));
        } else {
            return x * myPow(x, (int) (nn-1));
        }
    }
}