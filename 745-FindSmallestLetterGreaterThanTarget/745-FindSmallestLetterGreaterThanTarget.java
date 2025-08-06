// Last updated: 8/6/2025, 11:03:17 AM
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int l = 0, h = letters.length - 1;
        while(l <= h) {
            int m = l + (h-l)/2;
            if(target >= letters[m]) l = m + 1;
            else h = m - 1;
        }
        return (l == letters.length) ? letters[0] : letters[l];
    }
}