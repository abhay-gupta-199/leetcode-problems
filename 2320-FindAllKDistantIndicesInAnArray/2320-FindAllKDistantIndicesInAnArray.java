// Last updated: 8/6/2025, 11:01:36 AM
class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        int n = nums.length;
        List<Integer> keyIdx = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            if(nums[i] == key) keyIdx.add(i);
        }
        int l = keyIdx.size();

        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < l; j++) {
                if(Math.abs(i - keyIdx.get(j)) <= k) {
                    res.add(i);
                    break;
                }
            }
        }

        return res;
    }
}