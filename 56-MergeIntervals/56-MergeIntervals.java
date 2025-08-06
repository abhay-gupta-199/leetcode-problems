// Last updated: 8/6/2025, 11:04:56 AM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);
        List<int[]> l = new ArrayList<>();

        int prev_low = intervals[0][0], prev_high = intervals[0][1];
        int curr_low = -1, curr_high = -1;
        for(int i = 1; i < intervals.length; i++) {
            curr_low = intervals[i][0];
            curr_high = intervals[i][1];
            if(curr_low <= prev_high) {
                if(curr_high > prev_high) prev_high = curr_high;
                continue;
            } else {
                l.add(new int[]{prev_low, prev_high});
                prev_low = curr_low;
                prev_high = curr_high;
            }
        }
        l.add(new int[]{prev_low, prev_high});

        return l.toArray(new int[l.size()][2]);
    }
}