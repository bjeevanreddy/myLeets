class Solution {
     HashSet<Integer> isTravelNeeded = new HashSet<>();
    public int mincostTickets(int[] days, int[] costs) {
         int lastDay = days[days.length - 1];
        int dp[] = new int[lastDay + 1];
        Arrays.fill(dp, -1);
         // Mark the days on which we need to travel.
        for (int day : days) {
            isTravelNeeded.add(day);
        }

        return solve(dp, days, costs, 1);
        
    }
    
   private int solve(int dp[], int[] days,int[] costs,int curr) {

       if(curr> days[days.length-1]){
           return 0;
       }
        
        if(!isTravelNeeded.contains(curr)){
            return solve(dp,days,costs,curr+1);
        }
       
       if(dp[curr]!=-1){
           return dp[curr];
       }
        
        int oneDay = costs[0]+ solve(dp,days,costs,curr+1);
        int sevenDay = costs[1]+ solve(dp,days,costs,curr+7);
        int thirtyDay = costs[2]+ solve(dp,days,costs,curr+30);
        
        return dp[curr] = Math.min(oneDay,Math.min(sevenDay,thirtyDay));
    }
}