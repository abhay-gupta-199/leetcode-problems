// Last updated: 8/6/2025, 11:05:03 AM
class Solution {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(var row : matrix) {
            int l = 0, r = n-1;
            while(l < r) {
                int temp = row[l];
                row[l++] = row[r];
                row[r--] = temp;
            }
        }
    }
}