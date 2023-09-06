class Solution {
    public int minPathSum(int[][] grid) {
        int row= grid.length;
        
        int col = grid[0].length;
        
        int[][] memo = new int[row][col];
        
        for(int[] r: memo){
            Arrays.fill(r, -1);
        }
        return helper(grid, row-1, col-1, memo);
    }
    
    public static int helper(int[][] grid, int r, int c, int[][] memo){
        
        if(r >= grid.length ||  c>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(r==0&& c== 0){
            return grid[r][c];
        }
        
        if(memo[r][c]!=-1){
            return memo[r][c];
        }
        int right = Integer.MAX_VALUE;;
        int down = Integer.MAX_VALUE;
        
        if(c>0){
             right =  helper(grid, r,c-1,memo);
        }
        if(r>0){
              down  =   helper(grid, r-1, c,memo);
        }
      
        memo[r][c] =  grid[r][c] + Math.min(right,down);
        
        return memo[r][c];
    }
}