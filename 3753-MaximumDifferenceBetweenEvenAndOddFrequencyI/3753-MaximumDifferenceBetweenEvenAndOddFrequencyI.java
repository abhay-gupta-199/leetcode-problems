// Last updated: 8/6/2025, 11:00:02 AM
class Solution {
    public int maxDifference(String s) {
        int[] freq = new int[26];
        for(char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        int odd = 0, even = s.length();
        for(int f : freq) {
            if(f == 0) continue;
            if(f % 2 == 0) {
                even = Math.min(f, even);
            } else {
                odd = Math.max(f, odd);
            }
        }

        return odd - even;
    }
}