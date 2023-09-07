class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
       
        for(int i=0;i<m;i++){
             boolean flag=false;
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]) {
                    flag=true;
                }
                else if(flag){
                    if(nums2[j]>nums1[i]){
                        nums1[i]=nums2[j];
                        flag=false;
                    }
                }
            }
            if(flag) nums1[i]=-1;
        }
        // if(flag) nums1[m-1]=-1;
        return nums1;
    }
}