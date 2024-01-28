class Solution {
    public int numSubmatrixSumTarget(int[][] matrix, int target) {
        
        
        int m = matrix.length;
        int n = matrix[0].length;
        int[] sub = new int[n];
        int ans=0;
        for(int i=0;i<m;i++){
            Arrays.fill(sub,0);
            for(int j=i;j<m;j++){
                for(int k=0;k<n;k++){
                        sub[k]+= matrix[j][k];
                    }
                ans+= subArraySum(sub, target);
            }
        }
        return ans;
    }
    
    int subArraySum(int[] sub, int k){
        
        Map<Integer,Integer> map = new HashMap<>();
        int count=0;
        int sum=0;
        map.put(0,1);
        for(int i:sub){
            sum+=i;
            if(map.containsKey(sum-k)) {count += map.get(sum-k);}
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }
}