class Solution {
    public int numIslands(char[][] grid) {
        
        int m = grid.length;
        int n= grid[0].length;
        int res=0;
        boolean[][] visited = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(!visited[i][j] && grid[i][j]=='1'){
                    dfs(grid, i,j,visited);
                    res++;
                }
            }
        }
        
        return res;
    }
    
    void dfs(char[][] grid,int i, int j, boolean[][] visited){
        
        if(i<0 || j<0 || i>=grid.length || j>=grid[0].length || grid[i][j]=='0' || visited[i][j]){
            return;
        }
        visited[i][j] = true;
        dfs(grid, i,j-1,visited); // left
        dfs(grid, i,j+1,visited); //right
        dfs(grid, i-1,j,visited); // top
        dfs(grid, i+1,j,visited); // down
    }
}