// Last updated: 8/6/2025, 11:00:58 AM
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < words.length; i++) {
            if(words[i].indexOf(x) >= 0) {
                res.add(i);
            }
        }
        return res;
    }
}