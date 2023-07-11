class Solution {
    // public void moveZeroes(int[] nums) {
    //     int i=0;
    //     int j=0;
    //     if(nums.length<=1){
    //         return;
    //     }
    //     while(i<nums.length && j<nums.length){
    //         if(nums[i]!=0){
    //             nums[j++]=nums[i];
    //         }
    //         i++;
    //     }
    //     while(j<nums.length){
    //         nums[j++] = 0;
    //     }
    // }

    // Using swap
     public void moveZeroes1(int[] nums) {
        int j=0;
        if(nums.length<=1){
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                int x = nums[i];
                nums[i] = nums[j];
                nums[j++]=x;
            }
        }
        // while(j<nums.length){
        //     nums[j++] = 0;
        // }
    }
    
    // using swap but practise
     public void moveZeroes(int[] arr) {
    int start=0;
        // int i=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                swap(arr,start,i);
                start++;
            }
        }
     }
    
    static void  swap(int[] a, int x, int y){
        int t = a[x];
        a[x]=a[y];
        a[y]=t;
        
    }
}