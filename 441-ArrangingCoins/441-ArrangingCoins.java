// Last updated: 8/6/2025, 11:03:36 AM
class Solution {
    public int arrangeCoins(int n) {
        int l = 0, h = n;
        while(l <= h) {
            long m = l + (h-l)/2;
            long coin = m * (m+1)/2;
            if(coin == n) return (int)m;
            else if(coin > n) h = (int)m - 1;
            else l = (int)m + 1;
        }
        return h;
    }
}