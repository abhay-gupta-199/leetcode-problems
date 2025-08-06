// Last updated: 8/6/2025, 11:03:03 AM
class Solution {
    private boolean check(String word, String pattern) {
        Map<Character, Character> map = new HashMap<>();
        for(int i = 0; i < word.length(); i++) {
            char w = word.charAt(i);
            char p = pattern.charAt(i);
            // map.putIfAbsent(w, p);
            if(map.containsKey(w)) {
                if(map.get(w) != p) {
                    return false;
                }
            } else {
                if(map.containsValue(p)) {
                    return false;
                }
                map.put(w, p);
            }

        }
        return true;
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> res = new ArrayList<>();
        for(String word : words) {
            if(check(word, pattern)) {
                res.add(word);
            }
        }
        return res;
    }
}