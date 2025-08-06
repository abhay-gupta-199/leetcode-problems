// Last updated: 8/6/2025, 11:00:22 AM
class Solution {
    int bfs(List<List<Integer>> adj, int start, int maxDist) {
        boolean[] visited = new boolean[adj.size()];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});
        visited[start] = true;

        int count = 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int node = cur[0];
            int dist = cur[1];
            if (dist > maxDist) continue;
            count++;

            for (int neighbor : adj.get(node)) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.offer(new int[]{neighbor, dist + 1});
                }
            }
        }
        return count;
    }

    public int[] maxTargetNodes(int[][] edges1, int[][] edges2, int k) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;

        List<List<Integer>> adj1 = new ArrayList<>();
        for (int i = 0; i < n; i++) adj1.add(new ArrayList<>());
        for (int[] edge : edges1) {
            adj1.get(edge[0]).add(edge[1]);
            adj1.get(edge[1]).add(edge[0]);
        }

        List<List<Integer>> adj2 = new ArrayList<>();
        for (int i = 0; i < m; i++) adj2.add(new ArrayList<>());
        for (int[] edge : edges2) {
            adj2.get(edge[0]).add(edge[1]);
            adj2.get(edge[1]).add(edge[0]);
        }

        int maxTree2Reach = 0;
        for (int i = 0; i < m; i++) {
            int reach = bfs(adj2, i, k - 1);
            if(maxTree2Reach < reach) maxTree2Reach = reach;
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int reachTree1 = bfs(adj1, i, k);
            answer[i] = reachTree1 + maxTree2Reach;
        }

        return answer;
    }
}