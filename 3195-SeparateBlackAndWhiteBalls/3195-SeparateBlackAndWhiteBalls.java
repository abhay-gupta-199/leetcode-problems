// Last updated: 8/6/2025, 11:00:56 AM
class Solution {
    public long minimumSteps(String s) {
        int black = 0;
        long result = 0;
        for(char ch : s.toCharArray()) {
            if(ch == '1') {
                black++;
            } else {
                result += black;
            }
        }
        return result;
    }
}