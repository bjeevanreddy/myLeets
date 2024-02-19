class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0) return false;
        if(n==1) return true;
        if(n%2!=0) return false;
        
        return isPowerOfTwo(n/2);
    }
    
    
    public boolean isPowerOfTwo1(int n) {
        
        if(n==1) return true;
        if(n==0) return false;
        while(n>1){
            if(n%2!=0){
                return false;
            }
            n/=2;
        }
        return true;
    }
    
}