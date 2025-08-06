// Last updated: 8/6/2025, 11:03:02 AM
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> res = new HashSet<>();
        Set<Integer> curr = new HashSet<>();
        for (int n : arr) {
            Set<Integer> next = new HashSet<>();
            next.add(n);
            for (int x : curr) {
                next.add(x | n);
            }
            curr = next;
            res.addAll(curr);
        }
        return res.size();
    }
}