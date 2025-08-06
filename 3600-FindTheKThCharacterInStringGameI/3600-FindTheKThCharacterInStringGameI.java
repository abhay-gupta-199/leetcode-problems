// Last updated: 8/6/2025, 11:00:35 AM
class Solution {
    public char kthCharacter(int k) {
        StringBuilder word = new StringBuilder("a");
        while(word.length() < k) {
            StringBuilder sb = new StringBuilder();
            for(int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if(ch == 'z') sb.append('a');
                else sb.append((char) (ch + 1));
            }
            word.append(sb);
        }
        return word.charAt(k - 1);
    }
}