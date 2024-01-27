class Solution {
      int mod = 1000000007;
        Integer [] [] memo = new Integer [1001] [1001];
    public int kInversePairs(int n, int k) {
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
}