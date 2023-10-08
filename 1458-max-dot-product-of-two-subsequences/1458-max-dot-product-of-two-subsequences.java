// class Solution {
//      Set<List<Integer>> list1;
//     Set<List<Integer>> list2;
//     public int maxDotProduct(int[] nums1, int[] nums2) {
//        list1 = new HashSet<>();
//         list2 = new HashSet<>();
//         int size = Math.min(nums1.length, nums2.length);
        
//         subSeq(nums1, list1, 0,size,new ArrayList<>());
//         subSeq(nums2, list2, 0,size, new ArrayList<>());
       
        
//         return findDotProduct(list1, list2);
//     }
    
//     public static void subSeq(int[] nums, Set<List<Integer>> res,int start, int s, List<Integer> temp){
//         if(start>=nums.length){
//             if(temp.size()>0 && temp.size()<=s){
//               res.add(new ArrayList<>(temp));  
//             }
//               return;
//         }
//         temp.add(nums[start]);
//         subSeq(nums, res, start+1,s, temp);
//         temp.remove(temp.size()-1);
//         subSeq(nums, res,start+1, s,temp);
//     }
    
//     public static int findDotProduct(Set<List<Integer>> list1, Set<List<Integer>> list2){
//         int max =Integer.MIN_VALUE;
//         for(List<Integer> l1: list1){
//             for(List<Integer> l2:list2){
//                 if(l1.size()==l2.size()){
//                     max = Math.max(max,findProd(l1, l2));
//                 }
//             }
//         }
//         return max;
//     }
    
//     static int findProd(List<Integer> l1, List<Integer> l2){
        // int sum=0;
//         for(int i=0;i<l1.size();i++){
//             sum += l1.get(i)*l2.get(i);
//         }
        
//         return sum;
//     }
    
    
    class Solution {
    int[][] memo;
    
    public int dp(int i, int j, int[] nums1, int[] nums2) {
        if (i == nums1.length || j == nums2.length) {
            return 0;
        }
        
        if (memo[i][j] != 0) {
            return memo[i][j];
        }
        
        int use = nums1[i] * nums2[j] + dp(i + 1, j + 1, nums1, nums2);
        memo[i][j] = Math.max(use, Math.max(dp(i + 1, j, nums1, nums2), dp(i, j + 1, nums1, nums2)));
        return memo[i][j];
    }
    
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;
        
        for (int num: nums1) {
            firstMax = Math.max(firstMax, num);
            firstMin = Math.min(firstMin, num);
        }
        
        for (int num: nums2) {
            secondMax = Math.max(secondMax, num);
            secondMin = Math.min(secondMin, num);
        }
        
        if (firstMax < 0 && secondMin > 0) {
            return firstMax * secondMin;
        }
        
        if (firstMin > 0 && secondMax < 0) {
            return firstMin * secondMax;
        }
        
        memo = new int[nums1.length][nums2.length];
        return dp(0, 0, nums1, nums2);
    }
}
// }