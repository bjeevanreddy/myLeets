class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        
int count = 0;
        if (n == 0) {
            return true;
        }
        for (int i = 0; i < flowerbed.length;) {
            
            if (flowerbed[i] == 1) {
                i = i + 2;
            } else if (flowerbed[i] == 0 && i == flowerbed.length - 1) {
                flowerbed[i] = 1;
                count++;
                i = i + 2;
            } else if (flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                count++;
                i = i + 2;
            } else {
                i++;
            }
            if (n == count) {
                return true;
            }
        }
        
        return false;
    }
    
    
    // issue with edge cases
    public boolean canPlaceFlowers1(int[] flowerbed, int n) {
        
        int k=-1;
        for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                k=i;
                continue;
            }else if(i==0 && flowerbed[i]==0 && flowerbed[i+1]==0){
                flowerbed[i]=1;
                k=i;
                n--;
                continue;
            }
            else if(i-k >= 2){
                k = i;
                if(i+1<n &&flowerbed[i+1]==1){
                    continue;
                }
                n--;
            }
            if(n==0){
                return true;
            }
        }
        return false;
    }
       
}

// 0 0 0 0