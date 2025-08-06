// Last updated: 8/6/2025, 11:00:15 AM
class Solution {
    public int[] maxTargetNodes(int[][] edges1, int[][] edges2) {
        int n = edges1.length + 1;
        int m = edges2.length + 1;

        List<Integer>[] adj1 = new ArrayList[n];
        for(int i = 0; i < n; i++) adj1[i] = new ArrayList<>();
        for(int[] edge : edges1) {
            adj1[edge[0]].add(edge[1]);
            adj1[edge[1]].add(edge[0]);
        }

        List<Integer>[] adj2 = new ArrayList[m];
        for(int i = 0; i < m; i++) adj2[i] = new ArrayList<>();
        for(int[] edge : edges2) {
            adj2[edge[0]].add(edge[1]);
            adj2[edge[1]].add(edge[0]);
        }

        int[] depth1 = new int[n];
        boolean[] vistd1 = new boolean[n];
        dfs(0, 0, adj1, depth1, vistd1);

        int totalEven1 = 0;
        for(int depth : depth1) {
            if(depth % 2 == 0) totalEven1++;
        }
        int totalOdd1 = n - totalEven1;

        int[] depth2 = new int[m];
        boolean[] vistd2 = new boolean[m];
        int oddMax2 = bfs(adj2, depth2, vistd2);

        int[] result = new int[n];
        for(int i = 0; i < n; i++) {
            int even1 = depth1[i] % 2 == 0 ? totalEven1 : totalOdd1;
            result[i] = even1 + oddMax2;
        }
        return result;
    }

    void dfs(int node, int d, List<Integer>[] adj, int[] depth, boolean[] vistd) {
        vistd[node] = true;
        depth[node] = d;
        for(int neighbor : adj[node]) {
            if(!vistd[neighbor]) {
                dfs(neighbor, d + 1, adj, depth, vistd);
            }
        }
    }

    int bfs(List<Integer>[] adj, int[] depth, boolean[] vistd) {
        Queue<Integer> Q = new LinkedList<>();
        Q.add(0);
        vistd[0] = true;
        int even = 0, odd = 0;
        while(!Q.isEmpty()) {
            int node = Q.poll();
            if(depth[node] % 2 == 0) even++;
            else odd++;
            for(int neighbor : adj[node]) {
                if(!vistd[neighbor]) {
                    vistd[neighbor] = true;
                    depth[neighbor] = depth[node] + 1;
                    Q.add(neighbor);
                }
            }
        }
        return Math.max(even, odd);
    }
}