// Last updated: 8/6/2025, 11:02:49 AM
class Solution {
    int[] hash = new int[26];
    public String smallestEquivalentString(String s1, String s2, String baseStr) {
        for(int i = 0; i < 26; i++) hash[i] = i;

        for(int i = 0; i < s1.length(); i++) {
            union(s1.charAt(i) - 'a', s2.charAt(i) - 'a');
        }

        StringBuilder res = new StringBuilder();
        for(char ch : baseStr.toCharArray()) {
            res.append((char) (find(ch - 'a') + 'a'));
        }

        return res.toString();
    }

    private int find(int x) {
        if(hash[x] != x) hash[x] = find(hash[x]);

        return hash[x];
    }

    private void union(int x, int y) {
        int a = find(x), b = find(y);

        if(a == b) return;

        if(a < b) hash[b] = a;

        else hash[a] = b;
    }
}