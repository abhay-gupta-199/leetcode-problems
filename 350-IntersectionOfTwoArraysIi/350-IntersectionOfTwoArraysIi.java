// Last updated: 8/6/2025, 11:03:51 AM
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] temp = new int[1001];
        for(int x : nums1) {
            temp[x]++;
        }
        ArrayList<Integer> res = new ArrayList<>();
        for(int x : nums2) {
            if(temp[x] > 0) {
                res.add(x);
                temp[x]--;
            }
        }
        int[] ans = new int[res.size()];
        for(int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}