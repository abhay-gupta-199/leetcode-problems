// Last updated: 8/6/2025, 11:05:00 AM
class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][] board = new char[n][n];
        for(char[] row : board) {
            Arrays.fill(row, '.');
        }
        queen(board, 0, n, ans);
        return ans;
    }

    public static void queen(char[][] board, int row, int n, List<List<String>> ans) {
        if(row == n) {
            ans.add(list_builder(board));
            return;
        }
        for(int col = 0; col < n; col++) {
            if(is_valid(board, row, col)) {
                board[row][col] = 'Q';
                queen(board, row+1, n, ans);
                board[row][col] = '.';
            }
        }
    }

    public static List<String> list_builder(char[][] board) {
        List<String> l = new ArrayList<>();
        for(char[] row : board) {
            l.add(new String(row));
        }
        return l;
    }

    public static boolean is_valid(char[][] board, int row, int col) {
        // upper column
        for(int i = 0; i < row; i++) {
            if(board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        int r = row;
        int c = col;
        while(r >= 0 && c >= 0) {
            if(board[r--][c--] == 'Q') {
                return false;
            }
        }

        // diagonal right
        r = row;
        c = col;
        while(r >= 0 && c < board[0].length) {
            if(board[r--][c++] == 'Q') {
                return false;
            }
        }

        return true;
    }
}