// Last updated: 8/6/2025, 11:04:46 AM
class Solution {
    private void helper(int i, int[] nums, List<Integer> l, List<List<Integer>> res) {
        if(i == nums.length) {
            res.add(new ArrayList<>(l));
            return;
        }

        helper(i+1, nums, l, res);
        l.add(nums[i]);
        helper(i+1, nums, l, res);
        l.removeLast();
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        helper(0, nums, new ArrayList<>(), res);
        return res;
    }
}