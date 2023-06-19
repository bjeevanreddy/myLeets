class Solution {
    public int reverse1(int u) {
        
        int x = u>0?u:-u;
        int sum=0;
        // if(x<Integer.MIN_VALUE || x>Integer.MAX_VALUE){
        //     return 0;
        // }
        while(x>0){
            int rem = x%10;
           
            sum = sum*10 +rem;
            x=x/10;
        }
        sum = sum/10;
        if(sum<Integer.MIN_VALUE || sum>Integer.MAX_VALUE){
            return 0;
        }
        return u>0?sum:-sum;
        
        
    }
     public int reverse(int x) {
    int result = 0;

    while (x != 0)
    {
        int tail = x % 10;
        int newResult = result * 10 + tail;
        if ((newResult - tail) / 10 != result)
        { return 0; }
        result = newResult;
        x = x / 10;
    }

    return result;
       }
}