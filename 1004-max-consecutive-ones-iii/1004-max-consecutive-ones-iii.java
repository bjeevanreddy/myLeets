class Solution {
    public int longestOnes(int[] arr, int k) {
        int n= arr.length;
        int count=0;
        int max=0;
        int L=0;
        int end=0;
        
        while(end<n){
            
            if(arr[end]==0){
                count++;
            }
            while(count>k){
                if(arr[L]==0){
                    count--;
                }
                L++;
            }
            max = Math.max(max,end-L+1);
            end++;
        }
        return max;
    }
}