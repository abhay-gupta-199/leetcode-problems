// Last updated: 2/24/2026, 10:33:48 AM
1class Solution {
2    public boolean validPath(int n, int[][] edges, int src, int des) {
3        if(src == des) return true;
4        
5        Map<Integer,List<Integer>> graph = new HashMap();
6        boolean[] vis = new boolean[n];
7
8        for(int i = 0; i < n; i++) graph.put(i, new ArrayList());
9        for(int[] e : edges) {
10            graph.get(e[0]).add(e[1]);
11            graph.get(e[1]).add(e[0]);
12        }
13        return dfs(graph, vis, src, des);
14    }
15
16    boolean dfs(Map<Integer,List<Integer>> graph,boolean[] vis, int src, int des) {
17        if(vis[src]) return true;
18        vis[src] = true;
19
20        for(int nbrs : graph.get(src)) {
21            if(nbrs == des) return true;
22
23            if(!vis[nbrs]) {
24                boolean flag = dfs(graph, vis, nbrs, des);
25                if(flag) return true;
26            }
27        }
28        return false;
29    }
30}