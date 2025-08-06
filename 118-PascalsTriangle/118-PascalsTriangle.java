// Last updated: 8/6/2025, 11:04:35 AM
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(1));
        for(int i = 1; i < numRows; i++) {
            List<Integer> curr = new ArrayList<>();
            List<Integer> prev = new ArrayList<>(res.get(i-1));

            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    curr.add(1);
                } else {
                    int val = prev.get(j - 1) + prev.get(j);
                    curr.add(val);
                }
            }

            res.add(curr);
        }
        return res;
    }
}