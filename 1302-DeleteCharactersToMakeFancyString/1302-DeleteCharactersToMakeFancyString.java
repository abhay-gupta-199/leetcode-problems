// Last updated: 8/6/2025, 11:02:42 AM
class Solution {
    public String makeFancyString(String s) {
        StringBuilder res = new StringBuilder();
        res.append(s.charAt(0));
        int c = 1;
        for(int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)) c++;
            else c = 1;
            if(c < 3) res.append(s.charAt(i));
        }
        return res.toString();
    }
}