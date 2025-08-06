// Last updated: 8/6/2025, 11:05:06 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        sum(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }
    public static void sum(int[] cans, int t, int idx, List<List<Integer>> ans, List<Integer> l) {
        if(t == 0) {
            ans.add(new ArrayList<>(l));
            return;
        }
        for(int i = idx; i < cans.length; i++) {
            if(t >= cans[i]) {
                l.add(cans[i]);
                sum(cans, t - cans[i], i, ans, l);
                l.remove(l.size() - 1);
            }
        }
    }
}