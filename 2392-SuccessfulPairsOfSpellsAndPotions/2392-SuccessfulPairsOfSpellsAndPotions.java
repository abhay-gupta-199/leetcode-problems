// Last updated: 10/13/2025, 10:18:38 PM
class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        Arrays.sort(potions);
        int[] res = new int[n];

        for(int i = 0; i < n; i++) {
            int l = 0, r = m-1;
            while(l <= r) {
                int mid = l + (r-l)/2;
                if(1L * spells[i] * potions[mid] >= success) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
            res[i] = m - l;
        }
        return res;
    }
}