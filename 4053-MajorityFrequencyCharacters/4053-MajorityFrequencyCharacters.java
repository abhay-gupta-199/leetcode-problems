// Last updated: 9/28/2025, 10:27:46 PM
class Solution {
    public String majorityFrequencyGroup(String s) {
        Map<Character, Integer> freq = new HashMap<>();
        for(char ch : s.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        Map<Integer, Integer> map = new HashMap<>();
        int size = 0, best = 0;
        for(int f : freq.values()) {
            int c = map.getOrDefault(f, 0) + 1;
            map.put(f, c);
            if(c > size || (c == size && f > best)) {
                size = c;
                best = f;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char key : freq.keySet()) {
            if(freq.get(key) == best) sb.append(key);
        }
        return sb.toString();
    }
}