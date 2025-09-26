// Last updated: 9/26/2025, 2:20:42 PM
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int n = bloomDay.length;
        long required = 1L * m * k;
        if(n < required) return -1;
        int l = Integer.MAX_VALUE, r = Integer.MIN_VALUE;
        for(int x : bloomDay) {
            l = Math.min(l, x);
            r = Math.max(r, x);
        }

        while(l <= r) {
            int mid = l + (r-l)/2;

            if(possible(bloomDay, m, k, mid)) {
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    boolean possible(int[] ar, int m, int k, int days) {
        int c = 0, cnt = 0;
        for(int x : ar) {
            if(x <= days) c++;
            else c = 0;

            if(c == k) {
                cnt++;
                c = 0;
            }

            if(cnt == m) return true;
        }
        if(cnt == m) return true;
        else return false;
    }
}