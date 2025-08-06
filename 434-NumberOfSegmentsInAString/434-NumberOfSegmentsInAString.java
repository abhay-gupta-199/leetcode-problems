// Last updated: 8/6/2025, 11:03:39 AM
class Solution {
    public int countSegments(String s) {
        int c = 0;
        for(int i = 0; i < s.length(); i++) {
            if((i == 0 || s.charAt(i-1) == ' ') && s.charAt(i) != ' ') {
                c++;
            }
        }
        return c;
    }
}