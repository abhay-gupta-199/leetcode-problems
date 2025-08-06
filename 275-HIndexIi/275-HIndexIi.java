// Last updated: 8/6/2025, 11:04:00 AM
class Solution {
    public int hIndex(int[] cits) {
        int l = 0, r = cits.length - 1, h = 0;
        while(l <= r) {
            int m = l + (r-l)/2;
            int c = cits.length - m;
            if(c <= cits[m]) {
                h = c;
                r = m - 1;
            }
            else l = m + 1;
        }
        return h;
    }
}