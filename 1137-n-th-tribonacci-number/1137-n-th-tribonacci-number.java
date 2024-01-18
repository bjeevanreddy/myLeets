class Solution {
    public int tribonacci(int n) {
        int first = 0;
        int second = 1;
        int third = 1;
        if(n<=1){
            return n;
        }
        for(int i=3;i<=n;i++){
            int f = first+second+third;
            first = second;
            second = third;
            third = f;
        }
        return third;
       
    }
}