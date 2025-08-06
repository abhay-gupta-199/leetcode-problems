// Last updated: 8/6/2025, 11:04:52 AM
class Solution {
    public int mySqrt(int x) {
        if(x == 0) return 0;
        int l = 0, r = x;
        while(l <= r) {
            int m = l + (r - l)/2;
            if(m == 0) m = 1;
            int y = x/m; 
            if(y == m) return m;
            else if(y > m) l = m + 1;
            else r = m - 1;
        }
    return r;   
    }
}