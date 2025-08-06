// Last updated: 8/6/2025, 11:05:12 AM
class Solution {
    private boolean isValidRow(int r, char[][] board) {
        Set<Character> set = new HashSet<>();
        char item;
        for(int c = 0; c < 9; c++) {
            item = board[r][c];
            if(item == '.') continue;
            if(set.contains(item)) return false;
            set.add(item);
        }
        return true;
    }

    private boolean isValidColumn(int c, char[][] board) {
        Set<Character> set = new HashSet<>();
        char item;
        for(int r = 0; r < 9; r++) {
            item = board[r][c];
            if(item == '.') continue;
            if(set.contains(item)) return false;
            set.add(item);
        }
        return true;
    }

    private boolean isValidBlock(int r, int c, char[][] board) {
        Set<Character> set = new HashSet<>();
        char item;
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                item = board[3*r + i][3*c + j];
                if(item == '.') continue;
                if(set.contains(item)) return false;
                set.add(item);
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for(int r = 0; r < 9; r++) {
            if(!isValidRow(r, board)) return false;
        }

        for(int c = 0; c < 9; c++) {
            if(!isValidColumn(c, board)) return false;
        }

        for(int r = 0; r < 3; r++) {
            for(int c = 0; c < 3; c++) {
                if(!isValidBlock(r, c, board)) return false;
            }
        }

        return true;
    }
}