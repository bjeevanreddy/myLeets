class Solution {
    public int countSubstrings1(String s) {
      if(s.length() == 0)return 0;
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        int res = 0;
        
        // Base Case 1 :  length = 1 ---> true
        for(int i = 0 ; i < n ; i++){
            dp[i][i] = true;
            res++;
        }
        
        // Base Case 2 :  Length = 2 ---> char[i] == char[i+1]
        for(int i = 0 ; i < n - 1 ; i++){
            dp[i][i + 1] = s.charAt(i) == s.charAt(i + 1);
            if(dp[i][i + 1]) 
                res++;
        }
        
        // Base Case :  Length > 2 ---> char[start] == char[end] && dp[i+1][j-1] is true
        for(int len = 3 ; len <= n ; len++){
            for(int i = 0 , j = i + len - 1 ; j < n ; j++, i++){
                dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
                if(dp[i][j])
                    res++;
            }
        }
        return res;
    }
    
    public int countSubstrings2(String s) {
    int n = s.length();
    int res = 0;
    boolean[][] dp = new boolean[n][n];
    for (int i = 0; i < n; i++) {
        for (int j = i; j < n; j++) {
            dp[i][j] = s.charAt(i) == s.charAt(j) && (j - i  + 1 < 3 || dp[i + 1][j - 1]);
            if(dp[i][j]) ++res;
            System.out.print(dp[i][j]+" ");
        }
         System.out.println();
    }
    return res;
}
    
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            c+=helper(s, i,i) + helper(s, i,i+1);
        }
        return c;
           
    }
    
    int helper(String s, int l, int e){
        int c=0;
        while(l>=0 && e<s.length() && l<=e){
            if(s.charAt(l)==s.charAt(e)){
                c++;
                 l--;
                e++;
            }else{
                break;
            }
           
        }
        return c;
    }
}