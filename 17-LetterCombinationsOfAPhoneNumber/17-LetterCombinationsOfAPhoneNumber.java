// Last updated: 8/6/2025, 11:05:34 AM
class Solution {
    static String[] key = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs",
    "tuv", "wxyz"};
    public List<String> letterCombinations(String digits) {
        List<String> ll = new ArrayList<>();
        if(digits.length() == 0) return ll;
        keypad(digits, "", ll);
        // ll.remove("");
        return ll;
    }
    public static void keypad(String ques, String ans, List<String> ll) {
        if(ques.length() == 0) {
            ll.add(ans);
            return;
        }
        char ch = ques.charAt(0);
        String getString = key[ch - 48];
        for(int i = 0; i < getString.length(); i++) {
            keypad(ques.substring(1), ans + getString.charAt(i), ll);
        }
    }
}