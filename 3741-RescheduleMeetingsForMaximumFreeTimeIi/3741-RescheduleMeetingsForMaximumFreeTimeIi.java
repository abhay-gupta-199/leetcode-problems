// Last updated: 8/6/2025, 11:00:07 AM
class Solution {
    public int maxFreeTime(int eventTime, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] gaps = new int[n+1];
        gaps[0] = startTime[0] - 0;
        for(int i = 1; i < n; i++) gaps[i] = startTime[i] - endTime[i-1];
        gaps[n] = eventTime - endTime[n-1];

        int[] prefix = new int[n+2];
        int[] suffix = new int[n+2];

        for(int i = 1; i <= n+1; i++) prefix[i] = Math.max(prefix[i-1], gaps[i-1]);
        for(int i = n; i >= 0; i--) suffix[i] = Math.max(suffix[i+1], gaps[i]);

        int res = 0;
        for(int i = 0; i < n; i++) {
            int meeting = endTime[i] - startTime[i];
            int maxGap = Math.max(prefix[i], suffix[i+2]);
            if(meeting <= maxGap) {
                res = Math.max(res, gaps[i] + meeting + gaps[i+1]);
            } else {
                res = Math.max(res, gaps[i] + gaps[i+1]);
            }
        }
        return res;
    }
}