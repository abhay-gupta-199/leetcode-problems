// Last updated: 8/6/2025, 11:05:48 AM
class Solution {
    public int reverse(int n) {
        long r = 0;
        while(n != 0) {
            r = r*10 + (n%10);
            n /= 10;
        }
        if(r > Integer.MAX_VALUE || r < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) r;
    }
}