// Last updated: 10/13/2025, 10:17:28 PM
class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int res = 0;

        for(int i = 0; i < n; i++) {
            int[] freq = new int[26];
            for(int j = i; j < n; j++) {
                int ch = s.charAt(j) - 'a';
                freq[ch]++;

                int val = 0;
                boolean ok = true;
            
                for(int c = 0; c < 26; c++) {
                    if(freq[c] > 0){
                        if(val == 0) val = freq[c];
                        else if(freq[c] != val) {
                            ok = false;
                            break;
                        }
                    }
                }
                if(ok) res = Math.max(res, j - i + 1);
            }
        }
        return res;
    }
}