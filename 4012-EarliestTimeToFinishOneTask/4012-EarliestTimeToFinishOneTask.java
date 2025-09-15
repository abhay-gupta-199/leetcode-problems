// Last updated: 9/15/2025, 10:17:05 AM
class Solution {
    public int earliestTime(int[][] tasks) {
        int res = 999;
        for(int[] x : tasks) {
            res = Math.min(res, x[0] + x[1]);
        }
        return res;
    }
}