class Solution {
      int mod = 1000000007;
        Integer [] [] memo = new Integer [1001] [1001];
    public int kInversePairs1(int n, int k) {
        if (n == 0) {
            return 0;
        }
        if (k == 0) {
            return 1;
        } 
        if (memo [n] [k] != null) {
            return memo [n] [k];
        }
        int inversePairs = 0;
        for (int i = 0; i <= Math.min(k, n - 1); i++) {
             inversePairs = (inversePairs + kInversePairs (n - 1, k- i)) % mod;
        }
        return memo [n] [k] = inversePairs;
    }
    
    public int kInversePairs(int n, int k){
        int[] [] dp = new int [n + 1] [k + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= k; j++) {
                if (j == 0) {
                    dp [i][j] = 1;
                    }
                else {
                    for (int p = 0; p <= Math.min(j, i-1); p++) {
                        dp [i][j] = (dp[i][j] + dp[i-1] [j-p]) % mod;
                    }
                }
            }
        }
        return dp [n] [k];
        }
}