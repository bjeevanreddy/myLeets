class Solution {
    public int addDigits1(int num) {
        
    while(num>9){
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
        num=sum;
    }
    return num;
}
    
    public int addDigits2(int num) {
        int sum=0;
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
            
            if(num==0 && sum>9){
                num=sum; 
                sum=0;
            }
        }
    return sum;
}
    
    
     public int addDigits(int num) {
        int sum=0;
         
         if(num<10){
             return num;
         }
        while(num>0){
            int rem = num%10;
            sum+=rem;
            num/=10;
        }
         return addDigits(sum);
            
        }
    
}