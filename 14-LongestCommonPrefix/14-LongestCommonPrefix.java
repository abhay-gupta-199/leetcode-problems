// Last updated: 8/6/2025, 11:05:39 AM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String word = strs[0];
        for(int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            for(int j = 1; j < n; j++) {
                if(strs[j].length() <= i || strs[j].charAt(i) != ch) {
                    return word.substring(0, i);
                }
            }
        }
        return word;
    }
}