// Last updated: 10/13/2025, 10:17:30 PM
class Solution {
    public boolean scoreBalance(String s) {
        int s1 = 0, s2 = 0;
        
        for(char ch : s.toCharArray()) {
            s1 += ch - 96;
        }

        for(char ch : s.toCharArray()) {
            s1 -= ch - 96;
            s2 += ch - 96;
            if(s1 == s2) return true;
        }

        return false;
    }
}