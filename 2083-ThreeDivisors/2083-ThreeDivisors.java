// Last updated: 8/6/2025, 11:02:05 AM
class Solution {
    public boolean isThree(int n) {
        int c = 0;
        for(int i = 2; i < n; i++) {
            if(n % i == 0) {
                c++;
            }
            if(c > 1) {
                return false;
            }
        }
        return c == 1;
    }
}