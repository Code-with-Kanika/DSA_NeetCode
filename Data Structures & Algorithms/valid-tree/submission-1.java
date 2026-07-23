class Solution {
     private boolean dfs(int node, int parent, Set<Integer> visit,
                        List<List<Integer>> adj) {
        if (visit.contains(node)) {
            return false;
        }

        visit.add(node);
        for (int nei : adj.get(node)) {
            if (nei == parent) {
                continue;
            }
            if (!dfs(nei, node, visit, adj)) {
                return false;
            }
        }
        return true;
    }
    public boolean validTree(int n, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for(int[] edg : edges){
            adj.get(edg[0]).add(edg[1]);
            adj.get(edg[1]).add(edg[0]);
        }
        Set<Integer> visit = new HashSet<>();
        if (!dfs(0, -1, visit, adj)) {
            return false;
        }

        return visit.size() == n;
    }
}