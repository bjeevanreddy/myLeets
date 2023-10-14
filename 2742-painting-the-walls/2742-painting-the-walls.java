class Solution {
      int max = Integer.MAX_VALUE;
    public int paintWalls(int[] cost, int[] time) {
      
        int dp[][] = new int[cost.length][time.length+1];
        
        // for(int[] row: dp){
        //     Arrays.fill(row,-1);
        // }
       return solve(cost, time, 0, cost.length,dp);
       // return max;
    }
    
    int solve1(int[] cost, int[] time, int start, List<Integer> temp, int[][] dp){
        
        if(start==time.length){
            List<Integer> t = new ArrayList<>(temp);
            // System.out.println(t);
            int timeT= 0;
            int costT= 0;
            for(int i:t){
                timeT+=time[i];
                costT+=cost[i];
            }
            if(timeT >= time.length-t.size()){
                max = Math.min(max, costT);
            }
            return max;
        }
        
        temp.add(start);
        int painted =  solve1(cost, time, start+1, temp,dp);
        temp.remove(temp.size()-1);
        int not = solve1(cost, time, start+1, temp,dp);
        return Math.min(painted, not);
    }
    int solve(int[] cost, int[] time, int start, int spent, int[][] dp){
       
        
         if(spent<=0){
            return 0;
        }
        if(start==cost.length){
            return (int) 1e9;
        }
        
       
        if(dp[start][spent]!=0){
            return dp[start][spent];
        }
        int paint =  cost[start] + solve(cost, time, start+1, spent-1-time[start],dp);
        
        int not = solve(cost, time, start+1, spent,dp);
        
        dp[start][spent] = Math.min(paint, not);
        
        return dp[start][spent];
    }
}



//  Time   1 1 1 1
//          - - - -
//  cost    2 3 4 2
    
    
    
