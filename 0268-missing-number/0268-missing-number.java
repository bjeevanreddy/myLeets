class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum =0;
        for(int i=0;i<=nums.length;i++){
            sum+=i;
        }
        for(int i:nums){
           sum-=i;
            
        }
        return sum;
    }
    public int missingNumber1(int[] nums) {
        int n=nums.length;
        int sum = 0;
        for(int i=0;i<=nums.length;i++){
            sum += i;
            if(i<nums.length)
                sum -= nums[i];
        }
        return sum;
    }
     public int missingNumber2(int[] nums) {
         Set<Integer> set = new HashSet<>();
        for(int i=0;i<=nums.length;i++){
           if(!set.contains(i)){
               return i;
           }
        }
        return 0;
    }
}