// Last updated: 8/6/2025, 11:03:20 AM
class Solution {
    public double knightProbability(int n, int k, int row, int col) {
        int[][] moves = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2},
                         {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        double[][] dp = new double[n][n];
        dp[row][col] = 1.0;

        while(k-- > 0) {
            double[][] new_dp = new double[n][n];
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    for(int[] m : moves) {
                        int r = i + m[0];
                        int c = j + m[1];
                        if(r >= 0 && r < n && c >= 0 && c < n) {
                            new_dp[r][c] += dp[i][j] / 8.0;
                        }
                    }
                }
            }
            dp = new_dp;
        }

        double res_prob = 0.0;
        for(double[] r : dp) {
            for(double c : r) {
                res_prob += c;
            }
        }
        return res_prob;
    }
}