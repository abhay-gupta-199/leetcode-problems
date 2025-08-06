// Last updated: 8/6/2025, 11:03:56 AM
class Solution {
    public void reverseString(char[] s) {
        int i = 0, j = s.length-1;
        while(i < j) {
            char tem = s[i];
            s[i++] = s[j];
            s[j--] = tem;
        }
        // for(int i = 0; i < s.length/2; i++) {
        //     char tem = s[i];
        //     s[i] = s[s.length -i -1];
        //     s[s.length -i -1] = tem;
        // }
    }
}