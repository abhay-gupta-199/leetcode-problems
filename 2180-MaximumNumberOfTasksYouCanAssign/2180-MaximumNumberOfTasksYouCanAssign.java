// Last updated: 8/6/2025, 11:01:54 AM
class Solution {
    public int maxTaskAssign(int[] tasks, int[] workers, int pills, int str) {
        Arrays.sort(tasks);
        Arrays.sort(workers);
        int l = 0, r = tasks.length < workers.length ? tasks.length : workers.length;
        while(l < r) {
            int m = l + (r-l+1)/2;
            if(task(tasks, workers, pills, str, m-1)) {
                l = m;
            } else {
                r = m - 1;
            }
        }
        return l;
    }

    public static boolean task(int[] ts, int[] ws, int p, int s, int m) {
        Deque<Integer> doped = new ArrayDeque<>();
        int w = ws.length - 1;

        while(m >= 0) {
            int t = ts[m];

            if(!doped.isEmpty() && doped.peekFirst() >= t) {
                doped.pollFirst();
            } else if(w >= 0 && ws[w] >= t) {
                w--;
            } else {
                while(w >= 0 && ws[w] + s >= t) {
                    doped.addLast(ws[w--]);
                }
                if(doped.isEmpty() || p == 0) {
                    return false;
                }
                doped.pollLast();
                p--;
            }
            m--;
        }
        return true;
    }
}