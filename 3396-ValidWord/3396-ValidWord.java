// Last updated: 8/6/2025, 11:00:41 AM
class Solution {
    public boolean isValid(String word) {
        if(word.length() < 3) return false;
        boolean vowel = false, cons = false;
        for(var ch : word.toCharArray()) {
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                vowel = true;
                continue;
            }
            if(Character.isLetter(ch)) {
                cons = true;
                continue;
            }
            if(!Character.isDigit(ch)) return false;
        }
        return vowel && cons;
    }
}