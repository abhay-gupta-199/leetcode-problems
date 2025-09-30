// Last updated: 10/1/2025, 12:00:24 AM
class Solution {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        int l = 1, r = position[n-1];
        while(l <= r) {
            int mid = l + (r-l)/2;
            if(isOK(position, m, mid)) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return r;
    }

    boolean isOK(int[] pos, int m, int dis) {
        int c = 1, p = 0;
        for(int i = 1; i < pos.length; i++) {
            if(pos[i] >= pos[p] + dis) {
                c++;
                p = i;
            }
            if(c == m) return true;
        }
        return false;
    }
}