// Last updated: 8/6/2025, 11:05:09 AM
class Solution {
    public void solveSudoku(char[][] board) {
        sudoku(board, 0, 0);
    }

    public static boolean sudoku(char[][] grid, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            return true;
        }
        if (grid[row][col] != '.') {
            return sudoku(grid, row, col + 1);
        } else {
            for (int val = 1; val <= 9; val++) {
                if (is_valid(grid, row, col, val)) {
                    grid[row][col] = (char) (val + 48);
                    boolean ans = sudoku(grid, row, col + 1);
                    if (ans) {
                        return true;
                    }
                    grid[row][col] = '.';
                }
            }
        }
        return false;
    }

    public static boolean is_valid(char[][] grid, int row, int col, int val) {
        // row & column
        for(int i = 0; i < 9; i++) {
            if(grid[row][i] == (char) (val + 48)) {
                return false;
            }
            if(grid[i][col] == (char) (val + 48)) {
                return false;
            }
        }
        // 3*3 matrix
        int r = row - row % 3; // 3 * (row / 3)
        int c = col - col % 3; // 3 * (col / 3)
        for(int i = r; i < r+3; i++) {
            for(int j = c; j < c+3; j++) {
                if(grid[i][j] == (char) (val + 48)) {
                    return false;
                }
            }
        }
        return true;
    }
}