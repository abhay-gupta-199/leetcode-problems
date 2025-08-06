// Last updated: 8/6/2025, 11:01:30 AM
class Solution {
    private int[] xorInSubtree;
    private Set<Integer>[] childrenSet;
    private List<Integer>[] tree;

    private void dfs(int current, int parent, int[] values) {
        xorInSubtree[current] = values[current];
        childrenSet[current].add(current);

        for (int child : tree[current]) {
            if (child != parent) {
                dfs(child, current, values);
                xorInSubtree[current] ^= xorInSubtree[child];
                childrenSet[current].addAll(childrenSet[child]);
            }
        }
    }
    public int minimumScore(int[] nums, int[][] edges) {
        int totalNodes = nums.length;
        tree = new ArrayList[totalNodes];
        for (int i = 0; i < totalNodes; i++) {
            tree[i] = new ArrayList<>();
        }

        for (int[] edge : edges) {
            tree[edge[0]].add(edge[1]);
            tree[edge[1]].add(edge[0]);
        }

        xorInSubtree = new int[totalNodes];
        childrenSet = new HashSet[totalNodes];
        for (int i = 0; i < totalNodes; i++) {
            childrenSet[i] = new HashSet<>();
        }

        dfs(0, -1, nums);

        int wholeTreeXor = xorInSubtree[0];
        int bestScore = Integer.MAX_VALUE;

        for (int first = 1; first < totalNodes; first++) {
            for (int second = first + 1; second < totalNodes; second++) {
                int xorFirst = xorInSubtree[first];
                int xorSecond = xorInSubtree[second];
                int part1, part2, part3;

                if (childrenSet[first].contains(second)) {
                    part1 = xorSecond;
                    part2 = xorFirst ^ xorSecond;
                    part3 = wholeTreeXor ^ xorFirst;
                } else if (childrenSet[second].contains(first)) {
                    part1 = xorFirst;
                    part2 = xorSecond ^ xorFirst;
                    part3 = wholeTreeXor ^ xorSecond;
                } else {
                    part1 = xorFirst;
                    part2 = xorSecond;
                    part3 = wholeTreeXor ^ xorFirst ^ xorSecond;
                }

                int maxPart = Math.max(part1, Math.max(part2, part3));
                int minPart = Math.min(part1, Math.min(part2, part3));
                bestScore = Math.min(bestScore, maxPart - minPart);
            }
        }

        return bestScore;
    }
}