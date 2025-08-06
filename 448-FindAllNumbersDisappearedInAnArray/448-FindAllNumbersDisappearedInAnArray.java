// Last updated: 8/6/2025, 11:03:33 AM
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> ll = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            int idx = nums[i] < 0 ? -nums[i] - 1 : nums[i] - 1;
            if(nums[idx] > 0) nums[idx] = -nums[idx];
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > 0) {
                ll.add(i+1);
            }
        }
        return ll;
    }
}