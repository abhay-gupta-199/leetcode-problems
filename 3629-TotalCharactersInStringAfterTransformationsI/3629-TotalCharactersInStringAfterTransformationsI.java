// Last updated: 8/6/2025, 11:00:25 AM
class Solution {
    public int lengthAfterTransformations(String s, int t) {
        int mod = 1_000_000_007;
        long[] hash = new long[26];
        for(char ch : s.toCharArray()) {
            hash[ch - 'a']++;
        }

        int head = 0;
        while(t-- > 0) {
            int zi = (head + 25) % 26;
            long zc = hash[zi];

            head = zi;

            int bi = (head + 1) % 26;
            hash[bi] = (hash[bi] + zc) % mod;
        }

        long ans = 0;
        for(long x : hash) {
            ans += x;
        }
        return (int) (ans  % mod);
    }
}