class Solution {
    public int fib1(int n) {
        if(n<=1){
            return n;
        }
        return fib(n-1) + fib(n-2);
    }
    
    public int fib2(int n) {
        int[] dp = new int[n+1];
        if(n<=1) return n; 
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
           dp[i] = dp[i-1]+dp[i-2]; 
        }
        return dp[n];
    }
     public int fib(int n) {
          if(n<=1) return n; 
         int first = 0;
         int second = 1;
    
        for(int i=2;i<=n;i++){
          int third = first+second;
            first = second;
            second = third;
        }
        return second;
    }
}