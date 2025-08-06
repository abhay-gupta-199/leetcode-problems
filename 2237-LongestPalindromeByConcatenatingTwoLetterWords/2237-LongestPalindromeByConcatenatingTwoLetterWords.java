// Last updated: 8/6/2025, 11:01:46 AM
class Solution {
    public int longestPalindrome(String[] words) {
        Map<String, Integer> map = new HashMap<>();
        for(String s : words) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int res = 0;
        boolean odd = false;
        for(String s : map.keySet()) {
            int s_cnt = map.get(s);
            if(s_cnt == 0) continue;
            String r = reverse(s);
            if(!map.containsKey(r)) continue;
            if(s.equals(r)) {
                res += (s_cnt/2);
                if((s_cnt & 1) == 1) odd = true;
            } else {
                int r_cnt = map.get(r);
                res += Math.min(s_cnt, r_cnt);
                map.put(r, 0);
            }
        }
        res *= 4;
        if(odd) res += 2;
        return res;
    }

    private String reverse(String s) {
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(1));
        sb.append(s.charAt(0));
        return sb.toString();
    }
}