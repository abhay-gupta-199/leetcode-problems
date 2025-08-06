// Last updated: 8/6/2025, 11:01:24 AM
class Solution {
    public int mostBooked(int n, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> a[0] - b[0]);
        int[] count = new int[n];
        long[] occupied = new long[n];
        for (int[] meeting : meetings) {
            int idx = findRoom(occupied, meeting, n);
            count[idx]++;
        }

        int max = 0, res = 0;
        for (int i = 0; i < n; i++) {
            if (count[i] > max) {
                max = count[i];
                res = i;
            }
        }
        return res;
    }

    int findRoom(long[] occupied, int[] meeting, int n) {
        int start = meeting[0], end = meeting[1];
        int idx = -1;
        long min = Long.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            if (occupied[i] <= start) {
                idx = i;
                break;
            }
            if (occupied[i] < min) {
                min = occupied[i];
                idx = i;
            }
        }
        if (occupied[idx] <= start) {
            occupied[idx] = end;
        } else {
            long duration = end - start;
            occupied[idx] += duration;
        }
        return idx;
    }
}