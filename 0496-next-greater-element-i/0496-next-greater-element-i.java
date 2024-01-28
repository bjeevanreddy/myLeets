class Solution {
    
    // Brutforce
    public int[] nextGreaterElement1(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
       
        for(int i=0;i<m;i++){
             boolean flag=false;
            for(int j=0;j<n;j++){
                if(nums1[i]==nums2[j]) {
                    flag=true;
                    continue;
                }
                if(flag){
                    if(nums2[j]>nums1[i]){
                        nums1[i]=nums2[j];
                        flag=false;
                    }
                }
            }
            if(flag) nums1[i]=-1;
        }
        return nums1;
    }
    
   public int[] nextGreaterElement(int[] nums1, int[] nums2){
       
       HashMap<Integer, Integer> map = new HashMap<>();
       
       Stack<Integer> stack = new Stack<>();
       
       for(int i=0;i<nums2.length;i++){
           
           while(!stack.isEmpty() && stack.peek() < nums2[i]){
               map.put(stack.pop(), nums2[i]);
           }
           
           stack.add(nums2[i]);
       }
       int k=0;
       for(int num:nums1){
           nums1[k++] = map.getOrDefault(num, -1);
       }
       return nums1;
   }
}

