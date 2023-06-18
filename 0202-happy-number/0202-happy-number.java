class Solution {
    public boolean isHappy(int n) {
        if(n==1) return true;
        HashSet<Integer> track = new HashSet<>();
        while(!track.contains(n)){
            track.add(n);
                 int sum=0;
                while(n>0){
                     sum += Math.pow(n%10,2);
                    n/=10;
                }
                if(sum==1){
                    return true;
                }
                 n=sum;
        }
         return n==1;
    }
}