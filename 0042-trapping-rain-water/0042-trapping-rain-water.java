class Solution {
    public int trap(int[] height) {
        int l = height.length;
        int sum =0;
        for(int i=1;i<=l-2;i++){
            int lb = height[i];
            for(int j=0;j<i;j++){
                if(height[j]>lb){
                    lb = height[j];
                }
            }
            int rb = height[i];
            for(int k=i+1;k<l;k++){
                if(height[k]>rb){
                    rb = height[k];
                }
            }
            
            int diff = Math.min(lb,rb);
            sum += diff - (height[i]);
        }
        return sum;
    }
}