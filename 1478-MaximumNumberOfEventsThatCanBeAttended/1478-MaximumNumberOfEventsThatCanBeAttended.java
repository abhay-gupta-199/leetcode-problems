// Last updated: 8/6/2025, 11:02:35 AM
class Solution {
    public int maxEvents(int[][] events) {
        int res = 0, n = events.length;
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0, d = 1; i < n || !pq.isEmpty(); d++) {
            while(i < n && events[i][0] == d) pq.offer(events[i++][1]);

            while(!pq.isEmpty() && pq.peek() < d) pq.poll();

            if(!pq.isEmpty()) {
                pq.poll();
                res++;
            }
        }

        return res;
    }
}