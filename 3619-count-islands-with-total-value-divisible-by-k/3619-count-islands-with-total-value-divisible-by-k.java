class Solution {
    static long dfs(int[][] g, boolean[][] vis, int row, int col){
        int n = g.length;
        int m = g[0].length;
        if(row < 0 || row >= n || col >= m || col < 0){
            return 0;
        }
        if(vis[row][col] || g[row][col] == 0){
            return 0;
        }
        vis[row][col] = true;
        long ans = g[row][col] + dfs(g, vis, row+1, col) + dfs(g, vis, row-1, col);
        ans += dfs(g, vis, row, col+1) + dfs(g, vis, row, col-1);
        return ans;
    }
    public int countIslands(int[][] g, int k) {
        int n = g.length;
        int m = g[0].length;
        boolean[][] vis = new boolean[n][m];
        int cnt = 0;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                if(!vis[i][j] && (g[i][j] != 0)){
                    if(dfs(g, vis, i, j)%k == 0){
                        cnt++;
                    }
                }
            }
        }
        return cnt;
    }
}