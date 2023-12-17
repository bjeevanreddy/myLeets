class Solution {
    //kadane's algo - O(n)


    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
    int sum =0;
    // int start = 0; to find the subarray with max sum
    // int arStart =-1, arend=-1;
        for(int i:nums){
        //    if(sum==0){  new subarray sum starts from 0, so we are strating array from sum =0
        //        start = i;
        //    }
            sum+=i;
            if(sum>max){
                max = sum;
                // arStart = start; // when we got max sum, we will keep track of strta and end indexes
                // arEnd = i;
            }
            // max = Math.max(sum,max);
            if(sum<0){
                sum=0;
            }
            
        }

        //write a for loop from arStart,arend to print the subarray
        return max;
    }
}