class Solution {
    public List<Integer> getRow(int rowIndex) {
        
        List<Integer> x = new ArrayList<>();
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(1);
        pascal.add(one);
        for(int i=1;i<=rowIndex;i++){
            List<Integer> prev = pascal.get(i-1);
            List<Integer> curr = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    curr.add(1);
                }
                else curr.add(prev.get(j)+prev.get(j-1));
            }
            
            pascal.add(curr);
        }
        
        return pascal.get(rowIndex);
    }
}