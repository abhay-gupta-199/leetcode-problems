// Last updated: 8/6/2025, 11:02:40 AM
class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> res = new ArrayList<>();
        res.add(folder[0]);
        for(int i = 1; i < folder.length; i++) {
            String s = folder[i];
            String prev = res.get(res.size() - 1);
            if(!(s.startsWith(prev) && s.length() > prev.length() && s.charAt(prev.length()) == '/')) {
                res.add(s);
            }
        }
        return res;
    }
}