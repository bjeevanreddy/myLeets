class Solution {
    public double myPow(double x, int n) {
        
       // n = n<0?-n:n;
        
        if (x < -10000 || x > 10000) {
            return 0;
        }

    
        if(n==0){
            return 1;
        }
        if (n < 0) {
            n = -n;
            x = 1 / x;
        }
       // If n is even, recursively compute the square of x^(n/2)
        if (n % 2 == 0) {
            return myPow(x * x, n / 2);
        } 
        
        // If n is odd, recursively compute x^(n-1) and multiply it by x
        else {
            return x * myPow(x, n - 1);
        }
        
    }
}