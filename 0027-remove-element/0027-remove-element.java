class Solution {
    public int removeElement(int[] nums, int val) {
        int end=nums.length-1;
        int pos=nums.length-1;
        
        while(pos>=0 && pos<=end){
            if(nums[pos]==val){
                swap(nums,pos,end);
                end--;
                pos--;
                continue;
            }
            pos--;
        }
        
        return end+1;
    }
    
    static void swap(int[] a,int p, int e){
        int t = a[p];
        a[p]=a[e];
        a[e]=t;
    }
}