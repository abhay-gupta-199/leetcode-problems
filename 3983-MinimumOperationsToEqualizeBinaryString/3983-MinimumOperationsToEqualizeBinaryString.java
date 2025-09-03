// Last updated: 9/3/2025, 12:29:08 PM
class Solution {
    public int minOperations(String s, int k) {
        int z = 0, n = s.length();
        for(char ch : s.toCharArray()) {
            if(ch == '0') z++;
        }
        if(z == 0) return 0;
        if(k > n) return -1;
        if(k == n) {
            if(z == 0) return 0;
            else if(z == n) return 1;
            else return -1;
        }

        for(int i = 1; i <= n; i++) {
            long x = 1L * i * k;
            if(x < z) continue;
            if(((x - z) & 1L) != 0) continue;
            int mis = (i % 2 == 0 ? z : n-z);
            long cap = 1L * i * (n-k);
            if(cap >= mis) return i;
        }
        return -1;
    }
}