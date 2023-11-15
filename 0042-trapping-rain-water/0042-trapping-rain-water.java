class Solution {
    
    // BruteFrce- n^2
    public int trap1(int[] height) {
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
    
    // 2 arrays - O(n) and space is n
    public int trap(int[] height){
        int sum = 0;
        int l = height.length;
        
        int[] lb = new int[l];
        int[] rb = new int[l];
        
        lb[0] = height[0];
        rb[l-1] = height[l-1];
        for(int i=1;i<l;i++){
           lb[i] = Math.max(height[i], lb[i-1]); 
        }
        for(int j=l-2;j>=0;j--){
           rb[j] = Math.max(height[j], rb[j+1]); 
        }
        
        for(int k=0;k<l;k++){
            sum += Math.min(lb[k], rb[k]) - height[k];
        }
        return sum;
    }
}