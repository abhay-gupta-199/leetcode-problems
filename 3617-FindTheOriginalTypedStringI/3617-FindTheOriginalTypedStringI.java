// Last updated: 8/6/2025, 11:00:30 AM
class Solution {
    public int possibleStringCount(String word) {
        int res = 1;
        int c = 0;
        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i) == word.charAt(i-1)) {
                c++;
            } else {
                res += c;
                c = 0;
            }
        }
        res += c;
        return res;
    }
}