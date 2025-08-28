// Last updated: 8/28/2025, 12:04:10 PM
class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int area = 0;
        double max_d = 0;
        for(int[] x : dimensions) {
            int d = x[0] * x[0] + x[1] * x[1];
            int a = x[0] * x[1];
            if(d > max_d) {
                max_d = d;
                area = a;
            } else if(d == max_d) {
                area = Math.max(area, a);
            }
        }
        return area;
    }
}