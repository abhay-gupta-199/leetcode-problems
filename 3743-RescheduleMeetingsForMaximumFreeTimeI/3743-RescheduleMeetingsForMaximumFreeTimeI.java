// Last updated: 8/6/2025, 11:00:05 AM
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] breaks = new int[n+1];
        breaks[0] = startTime[0] - 0;
        breaks[n] = eventTime - endTime[n-1];
        for(int i = 1; i < n; i++) {
            breaks[i] = startTime[i] - endTime[i-1];
        }
        int sum = 0, res = 0;
        for(int i = 0; i <= k; i++) {
            sum += breaks[i];
        }
        res = Math.max(res, sum);
        for(int i = k; i < n; i++) {
            sum += breaks[i+1] - breaks[i-k];
            res = Math.max(res, sum);
        }
        return res;
    }
}