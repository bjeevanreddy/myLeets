class Solution {
    public int[][] divideArray(int[] nums, int k) {
        
        Arrays.sort(nums);
        int n= nums.length;
        int c=0;
        Stack<Integer> x = new Stack<>();
        int[][] res = new int[n/3][3];
        for(int i=0;i<n;i=i+3){
            int[] temp = new int[3];
            int j=i+2;
            // System.out.println(nums[j]+"  "+nums[i]);
            if(j-i+1 ==3 && nums[j]-nums[i]<=k){
                int y=0;
                for(int p=i;p<=j;p++){
                    temp[y++]=nums[p];
                }
                res[c++] = temp;
            }else{
                return new int[0][0];
            }
            // x.push(nums[i]);
            
        }
        return res;
        
    }
}