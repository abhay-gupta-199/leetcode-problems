// Last updated: 8/6/2025, 11:03:53 AM
class Solution {
    public String reverseVowels(String s) {
        char[] ch = s.toCharArray();
        int l = 0, r = ch.length - 1;

        boolean[] isVowel = new boolean[128];
        for(char c : "aeiouAEIOU".toCharArray()) {
            isVowel[c] = true;
        }
        while(l < r) {
            if(isVowel[ch[l]] && isVowel[ch[r]]) {
                char t = ch[l];
                ch[l] = ch[r];
                ch[r] = t;
                l++;
                r--;
            } if(!isVowel[ch[l]]) {
                l++;
            } if(!isVowel[ch[r]]) {
                r--;
            }
        }

        // String vowels = "aeiouAEIOU";
        // while(l < r) {
        //     if(vowels.contains(String.valueOf(ch[l])) && vowels.contains(String.valueOf(ch[r]))) {
        //         char t = ch[l];
        //         ch[l] = ch[r];
        //         ch[r] = t;
        //         l++;
        //         r--;
        //     } if(!vowels.contains(String.valueOf(ch[l]))) {
        //         l++;
        //     } if(!vowels.contains(String.valueOf(ch[r]))) {
        //         r--;
        //     }
        // }

        return new String(ch);
    }
}