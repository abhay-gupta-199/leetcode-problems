// Last updated: 8/6/2025, 11:04:57 AM
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        int minr = 0, maxr = m - 1;
        int minc = 0, maxc = n - 1;

        while(minr <= maxr && minc <= maxc) {
            for(int i = minc; i <= maxc; i++) {
                res.add(matrix[minr][i]);
            } minr++;

            for(int i = minr; i <= maxr; i++) {
                res.add(matrix[i][maxc]);
            } maxc--;

            for(int i = maxc; i >= minc && minr <= maxr; i--) {
                res.add(matrix[maxr][i]);
            } maxr--;

            for(int i = maxr; i >= minr && minc <= maxc; i--) {
                res.add(matrix[i][minc]);
            } minc++;
        }

        return res;
    }
}