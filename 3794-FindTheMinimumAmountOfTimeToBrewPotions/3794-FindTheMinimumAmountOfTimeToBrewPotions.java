// Last updated: 10/13/2025, 10:17:48 PM
class Solution {
    public long minTime(int[] skill, int[] mana) {
        int n = skill.length;
        int m = mana.length;

        long[] a = new long[n];

        for(int x : mana) {
            long curr = a[0];

            for(int i = 1; i < n; i++) {
                curr = Math.max(curr + 1L * skill[i-1] * x, a[i]);
            }

            a[n-1] = curr + 1L * skill[n-1] * x;

            for(int i = n-2; i >= 0; i--) {
                a[i] = a[i+1] - 1L * skill[i+1] * x;
            }
        }

        return a[n-1];
    }
}