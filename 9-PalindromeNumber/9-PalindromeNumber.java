// Last updated: 8/6/2025, 11:05:45 AM
class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        if(x == reverse(x))
            return true;
        return false;
    }
    public static int reverse(int x) {
        int d = 0, r = 0;
        while(x > 0) {
            r = r*10 + x%10;
            x /= 10;
        }
        return r;
    }
}