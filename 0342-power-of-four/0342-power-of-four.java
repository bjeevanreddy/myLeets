class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1){
            return true;
        }
        if(n==0) return false;
        
        return n%4==0 && isPowerOfFour(n/4);
        // while(n>0){
        //     if(n%4!=0) return false;
        //     n=n/4;
        //     if(n==1) return true;
        // }
        // return false;
    }
}