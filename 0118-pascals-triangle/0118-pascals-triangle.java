class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> x = new ArrayList<>();
        x.add(1);
        res.add(x);
        
        for(int i=1;i<numRows;i++){
            
            List<Integer> prev= res.get(i-1);
            List<Integer> temp = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    temp.add(1);
                }
                else{
                    temp.add(prev.get(j)+prev.get(j-1));
                }
            }
             res.add(temp);
           
        }
        
        return res;
    }
}