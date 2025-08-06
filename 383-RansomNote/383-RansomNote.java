// Last updated: 8/6/2025, 11:03:45 AM
class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] letter = new int[26];
        for(int i = 0; i < magazine.length(); i++) {
            letter[magazine.charAt(i) - 97]++;
        }
        for(int i = 0; i < ransomNote.length(); i++) {
            if(letter[ransomNote.charAt(i) - 97] <= 0) return false;
            letter[ransomNote.charAt(i) - 97]--;
        }
        return true;
    }
}