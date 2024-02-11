class Solution {
    public int cherryPickup(int[][] grid) {
        int n= grid.length;
        int m = grid[0].length;
        int max =0;
        int[][][] dp= new int[n][m][m];
        for(int r[][] : dp){
            for( int r1[]:r){
                Arrays.fill(r1,-1);
            }
        }
        max = Math.max(max,moveRobots(grid, n, m, 0,0,m-1,dp));
        return max;
    }
    
    
    int moveRobots(int[][] grid, int row, int col, int r1r, int r1c, int r2c,int[][][] dp){
        int sum=0;
        if(r1r>=row || r1c >=col || r2c>=col || r1c<0 || r2c<0){
            return 0;
        }
        int pick=0;
         // grid[r1r][r1c]=0;
         // grid[r2r][r2c]=0;
        if(dp[r1r][r1c][r2c]!= -1){
            return dp[r1r][r1c][r2c];
        }
        if( r1c==r2c){
             // System.out.println("here");
            pick=grid[r1r][r1c];
           
        }else {
            
            pick=grid[r1r][r1c] + grid[r1r][r2c];
        }
        // System.out.println(grid[r1r][r1c]+"  "+ grid[r1r][r2c]);
        for(int i=-1;i<=1;i++){
            int r1d= moveRobots(grid, row, col, r1r+1, r1c+i,r2c,dp);
            int r1dl = moveRobots(grid, row, col, r1r+1, r1c+i ,r2c-1,dp);
            int r1dr =moveRobots(grid, row, col, r1r+1, r1c+i, r2c+1,dp);
            sum = Math.max(sum, pick + Math.max(Math.max(r1d,r1dl),r1dr));
        }
        return dp[r1r][r1c][r2c] = sum;
    }
}