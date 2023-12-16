class Solution {
    
    //Brute Force -n^3 complexity - TLE
    public List<List<Integer>> threeSum1(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res= new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            for(int j=i+1;j<nums.length-1;j++){
                for(int k=j+1;k<nums.length;k++){
                      List<Integer> curr = new ArrayList<>();
                    int sum = nums[i]+nums[j]+nums[k];
                    if(sum==0 ){
                        curr.add(nums[i]);
                           curr.add(nums[j]);
                           curr.add(nums[k]);
                        if(!set.contains(curr)){
                            res.add(curr);
                            set.add(curr);
                        }else{
                            continue;
                        }
                    }
                }
            }
        }
        return res;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> res= new HashSet<>();
        // HashSet<List<Integer>> set = new HashSet<>();
        for(int i=0;i<nums.length-2;i++){
            int m=i+1;
            int e=nums.length-1;
           
           while(m<e){
                int sum = nums[i]+nums[m]+nums[e];
                if(sum==0){
                res.add(Arrays.asList(nums[i],nums[m],nums[e]));
                m++;
                e--;
            }else if(sum<0){
                m++;
            }
            else{
                e--;
            }
           }
        }
        return new ArrayList<>(res);
    }
}