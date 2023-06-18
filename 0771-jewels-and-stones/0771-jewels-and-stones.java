class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        
        int[] arr= new int[256];
        
        for(int i=0;i<stones.length();i++){
            
            arr[stones.charAt(i)]++;
        }
        int sum=0;
        for(int i=0;i<jewels.length();i++){
            sum+=arr[jewels.charAt(i)];
        }
        
        return sum;
    }
}