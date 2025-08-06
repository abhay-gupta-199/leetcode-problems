// Last updated: 8/6/2025, 11:04:32 AM
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length() - 1;
        while(l < r) {
            char cl = s.charAt(l);
            char cr = s.charAt(r);
            if(!(Character.isLetter(cl) || Character.isDigit(cl))) {
                l++;
                continue;
            }
            if(!(Character.isLetter(cr) || Character.isDigit(cr))) {
                r--;
                continue;
            }
            if(cl != cr) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}