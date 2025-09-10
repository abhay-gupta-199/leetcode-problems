// Last updated: 9/10/2025, 10:54:43 AM
class Solution {
    public int minOperations(String s) {
        int n = 26;
        int[] freq = new int[n];
        for(char ch : s.toCharArray()) freq[ch - 'a']++;

        int res = 0;
        for(int i = 1; i < n-1; i++) {
            if(freq[i] != 0) res++;
            freq[i+1] += freq[i];
        }

        if(freq[25] != 0) res++;

        return res;
    }
}