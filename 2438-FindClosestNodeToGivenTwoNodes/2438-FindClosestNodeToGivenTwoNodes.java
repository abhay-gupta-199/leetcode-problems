// Last updated: 8/6/2025, 11:01:27 AM
class Solution {
    public int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        
        int[] reach1 = new int[n];
        Arrays.fill(reach1, -1);
        boolean[] vistd1 = new boolean[n];
        int idx = node1;
        int steps = 0;
        while(idx != -1 && !vistd1[idx]) {
            vistd1[idx] = true;
            reach1[idx] = steps++;
            idx = edges[idx];
        }

        int[] reach2 = new int[n];
        Arrays.fill(reach2, -1);
        boolean[] vistd2 = new boolean[n];
        idx = node2;
        steps = 0;
        while(idx != -1 && !vistd2[idx]) {
            vistd2[idx] = true;
            reach2[idx] = steps++;
            idx = edges[idx];
        }

        int res = -1, min = n;

        for(int i = 0; i < n; i++) {
            int dist1 = reach1[i], dist2 = reach2[i];
            if(dist1 != -1 && dist2 != -1) {
                int dist = Math.max(dist1, dist2);
                if(dist < min) {
                    min = dist;
                    res = i;
                }
            }
        }
        return res;
    }
}