// Last updated: 8/6/2025, 10:59:59 AM
class Solution {
    public String smallestPalindrome(String s) {
        int n = s.length();
        if(n <= 2) return s;
        int mid = s.length() / 2;
        char[] ch = s.substring(0, mid).toCharArray();
        Arrays.sort(ch);
        StringBuilder sorted = new StringBuilder(new String(ch));
        StringBuilder res = new StringBuilder();
        res.append(sorted);
        if(s.length() % 2 == 1) res.append(s.charAt(mid));
        res.append(sorted.reverse());
        return res.toString();
    }
}