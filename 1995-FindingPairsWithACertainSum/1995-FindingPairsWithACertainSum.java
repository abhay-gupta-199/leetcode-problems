// Last updated: 8/6/2025, 11:02:12 AM
class FindSumPairs {
    int[] a1, a2;
    Map<Integer, Integer> map = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        a1 = nums1;
        a2 = nums2;
        for(int x : a2) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }
    }
    
    public void add(int i, int val) {
        map.put(a2[i], map.get(a2[i]) - 1);
        a2[i] += val;
        map.put(a2[i], map.getOrDefault(a2[i], 0) + 1);
    }
    
    public int count(int tot) {
        int cnt = 0;
        for(int x : a1) {
            cnt += map.getOrDefault(tot - x, 0);
        }
        return cnt;
    }
}

/**
 * Your FindSumPairs object will be instantiated and called as such:
 * FindSumPairs obj = new FindSumPairs(nums1, nums2);
 * obj.add(index,val);
 * int param_2 = obj.count(tot);
 */