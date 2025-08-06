// Last updated: 8/6/2025, 11:00:37 AM
class Solution {
    public int maximumLength(int[] nums) {
        int odd = 0, even = 0;
        int oddDp = 0, evenDp = 0;
        for(int x : nums) {
            if(x % 2 == 0) {
                even++;
                evenDp = Math.max(evenDp, oddDp + 1);
            } else  {
                odd++;
                oddDp = Math.max(oddDp, evenDp + 1);
            }
        }

        return Math.max(Math.max(odd, even), Math.max(oddDp, evenDp));
    }
}