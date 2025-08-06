// Last updated: 8/6/2025, 11:00:53 AM
class Solution {
    public List<String> findHighAccessEmployees(List<List<String>> access_times) {
        Map<String, List<Integer>> map = new HashMap<>();

        for(List<String> x : access_times) {
            String name = x.get(0);
            int time = Integer.parseInt(x.get(1));
            map.computeIfAbsent(name, val -> new ArrayList<>()).add(time);
        }

        List<String> res = new ArrayList<>();

        for(String key : map.keySet()) {
            List<Integer> l = map.get(key);
            if(l.size() >= 3) {
                Collections.sort(l);
                for(int i = 0; i < l.size() - 2; i++) {
                    if(l.get(i+2) - l.get(i) < 100) {
                        res.add(key);
                        break;
                    }
                } 
            }
        }

        return res;
    }
}