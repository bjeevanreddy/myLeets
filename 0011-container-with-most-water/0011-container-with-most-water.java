class Solution {
    // brute force -- TLE
    public int maxArea1(int[] height) {
        int max =0;
        for(int i=0;i<height.length-1;i++){
            for(int j=i+1;j<height.length;j++){
                int low=0;
                if(height[i]<=height[j]){
                    low = i;
                }
                else low = j;
                max= Math.max(max, (j-i) * height[low]);
            }
        }
        return max;
    }
    
    // Optim
    public int maxArea(int[] height) {
        int max =0;
        int left = 0;
        int right = height.length-1;
        while(left<right){
            max= Math.max(max, (right-left) * Math.min(height[left], height[right]));
                if(height[left]<height[right]){
                    left++;
                }
                else right--;
        }
        return max;
    }
}