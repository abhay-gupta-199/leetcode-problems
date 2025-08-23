class Solution {
    public int minimumSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int res = n * m;
        for(int i = 1; i < n; i++) {
            for(int j = 1; j < m; j++) {
                int top_left = minimumArea(grid, 0, i, 0, j);
                int top_right = minimumArea(grid, 0, i, j, m);
                int bottom = minimumArea(grid, i, n, 0, m);
                res = Math.min(res, top_left + top_right + bottom);

                int top = minimumArea(grid, 0, i, 0, m);
                int bottom_left = minimumArea(grid, i, n, 0, j);
                int bottom_right = minimumArea(grid, i, n, j, m);
                res = Math.min(res, top + bottom_left + bottom_right);
                
                int left = minimumArea(grid, 0, n, 0, j);
                res = Math.min(res, left + top_right + bottom_right);

                int right = minimumArea(grid, 0, n, j, m);
                res = Math.min(res, top_left + bottom_left + right);
            }
        }

        for(int i = 1; i < n-1; i++) {
            for(int j = i+1; j < n; j++) {
                int top = minimumArea(grid, 0, i, 0, m);
                int mid = minimumArea(grid, i, j, 0, m);
                int bottom = minimumArea(grid, j, n, 0, m);
                res = Math.min(res, top + mid + bottom);
            }
        }

        for(int i = 1; i < m-1; i++) {
            for(int j = i+1; j < m; j++) {
                int left = minimumArea(grid, 0, n, 0, i);
                int mid = minimumArea(grid, 0, n, i, j);
                int right = minimumArea(grid, 0, n, j, m);
                res = Math.min(res, left + mid + right);
            }
        }
        return res;
    }

    public int minimumArea(int[][] grid, int t, int b, int l, int r) {
        int up = b, down = 0, left = r, right = 0;
        for(int i = t; i < b; i++) {
            for(int j = l; j < r; j++) {
                if(grid[i][j] == 1) {
                    up = Math.min(up, i);
                    down = Math.max(down, i);
                    left = Math.min(left, j);
                    right = Math.max(right, j);
                }
            }
        }
        int area = (down - up + 1) * (right - left + 1);
        return area;
    }
}