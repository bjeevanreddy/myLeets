class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] x = new int[n+1];
        int missed=0;
        int dup=-1;
       int sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(x[nums[i]]!=0){
                dup = nums[i];
                continue;
            }
             x[nums[i]]=1;  
        }
        
        int actual = n *(n+1)/2;
        missed = (actual-sum)+dup;
        //  for(int i=1;i<=n;i++){
        //     if(x[i]==0){
        //         missed = i;
        //         break;
        //     }     
        // }
        return new int[]{dup,missed};
    }
}