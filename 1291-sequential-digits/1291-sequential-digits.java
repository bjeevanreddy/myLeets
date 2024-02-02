class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        int l = String.valueOf(low).length();
        int h = String.valueOf(high).length();
        List<Integer> res = new ArrayList<>();
        String s = "123456789";
        for(int i=l;i<=h;i++){
            // String fist = s.substring(0,i);
            // // System.out.println(fist);
            // Integer x = Integer.valueOf(fist);
            // if(x > low && x<high){
            //     res.add(x);
            // }
            for(int k = 0;k<=9-i;k++){
                String fist = s.substring(k, k+i);
                Integer x = Integer.valueOf(fist);
                if(x>high) break;
                if(low<=x && x<=high)
                {
                    res.add(x);
                }
                
            }
            
        }
        
        return res;
    }
}