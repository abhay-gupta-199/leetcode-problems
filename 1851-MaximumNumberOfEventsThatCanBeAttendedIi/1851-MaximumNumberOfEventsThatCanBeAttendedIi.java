// Last updated: 8/6/2025, 11:02:19 AM
class Solution {
    public int maxValue(int[][] events, int k) {
        if(k == 1) {
            int max = 0;
            for(var eve : events) {
                if(eve[2] > max) max = eve[2];
            }
            return max;
        }
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        int n = events.length;
        int[][] dp = new int[n+1][k+1];
        for(int i = n-1; i >= 0; i--) {
            int idx = binarySearch(events, i+1, n, events[i][1]);
            for(int j = k-1; j >= 0; j--) {
                dp[i][j] = Math.max(dp[i+1][j], dp[idx][j+1] + events[i][2]);
            }
        }
        return dp[0][0];
    }

    private int binarySearch(int[][] events, int l, int r, int end) {
        while(l < r) {
            int mid = l + (r - l)/2;
            if(events[mid][0] > end) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }
}