// Last updated: 8/28/2025, 12:03:39 PM
class Solution {
    public long maxProfit(int[] prices, int[] strategy, int k) {
        int n = prices.length;
        int m = k / 2;
        long og = 0L;
        long[] pre_now = new long[n+1];
        long[] pre_old = new long[n+1];
        
        for(int i = 0; i < n; i++) {
            pre_now[i+1] = pre_now[i] + prices[i];   
            long contri = (long) strategy[i] * prices[i];
            pre_old[i+1] = pre_old[i] + contri;
            og += contri;
        }

        long best = Long.MIN_VALUE;
        for(int i = 0; i + k <= n; i++) {
            int mid = i+m;
            int end = i+k;
            long second_sum = pre_now[end] - pre_now[mid];
            long old_sum = pre_old[end] - pre_old[i];
            long delta = second_sum - old_sum;
            if(delta > best) best = delta;
        }

        if(best < 0) best = 0;
        return og + best;
    }
}