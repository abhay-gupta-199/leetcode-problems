// Last updated: 8/6/2025, 11:05:50 AM
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || numRows > s.length()) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }
        int k = 0, flag = 1;
        for(int i = 0; i < s.length(); i++) {
            rows[k].append(s.charAt(i));
            if(k == 0) {
                flag = 1;
            } if(k == numRows - 1) {
                flag = -1;
            }
            k += flag;
        }

        StringBuilder res = new StringBuilder();
        for(StringBuilder sb : rows) {
            res.append(sb);
        }
        
        return res.toString();
    }
}