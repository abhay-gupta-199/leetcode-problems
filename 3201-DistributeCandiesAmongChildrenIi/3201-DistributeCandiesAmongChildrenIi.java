// Last updated: 8/6/2025, 11:00:55 AM
class Solution {
    public long distributeCandies(int n, int limit) {
        int max = Math.min(n, limit);
        long res = 0;
        for(int i = 0; i <= max; i++) {
            res += Math.max(Math.min(limit, n-i) - Math.max(0, n-i-limit) + 1, 0);
        }
        return res;
    }
}