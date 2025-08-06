// Last updated: 8/6/2025, 11:03:34 AM
class Solution {
    public int compress(char[] chars) {
        int l = 0;
        for(int st = 0; st < chars.length; ) {
            int end = st + 1;
            while(end < chars.length && chars[st] == chars[end]) {
                end++;
            }
            chars[l++] = chars[st];
            if(end - st > 1) {
                String c = String.valueOf(end - st);
                for(char x : c.toCharArray()) chars[l++] = x;
            } 
            st = end;
        }
        return l;
    }
}