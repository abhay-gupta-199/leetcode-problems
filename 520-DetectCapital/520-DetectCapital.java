// Last updated: 8/6/2025, 11:03:29 AM
class Solution {
    public boolean detectCapitalUse(String word) {
        int l = word.length();
        int count = 0;
        for(int i = 0; i < l; i++) {
            char c = word.charAt(i);
            if(c >= 65 && c <= 90) {
                count++;
            }
        }
        return ((count == 0) || (count == l) || (count == 1 && word.charAt(0) >= 65 && word.charAt(0) <= 90));
    }
}