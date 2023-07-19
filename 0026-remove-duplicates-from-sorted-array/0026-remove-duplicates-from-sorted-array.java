class Solution {
    // public int removeDuplicates(int[] nums) {
    //     int l=nums.length;
    //     int pos=0;
    //     int i=0;
    //    while(i<l){
    //         if(nums[pos]==nums[i]){
    //             i++;
    //         }else{
    //             nums[++pos]=nums[i];
    //             i++;
    //         }
    //     }
    //     return pos+1;
    // }
    public int removeDuplicates1(int[] nums) {
        int l=nums.length;
        int pos=0;
        int i=0;
       while(i < l){
            if(nums[pos]!=nums[i]){
                nums[++pos]=nums[i];
            }
            i++;
        }
        return pos+1;
    }
    
    public int removeDuplicates(int[] arr) {
    int i=1;
    int j=1;
       while(j<arr.length){
           
           if(arr[j-1]!=arr[j]){
               arr[i]=arr[j];
               i++;
              
           }
           
           // arr[i++]=arr[j];
           j++;
       }
        return i;
    }
}