class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        
        int l = String.valueOf(low).length();
        int h = String.valueOf(high).length();
        List<Integer> res = new ArrayList<>();
        String s = "123456789";
           for(;l <= h; l++){
            for(int j = 0; j + l <= 9; j++){
                String str = s.substring(j, j + l);
                int num = Integer.parseInt(str);
                if(num > high) break;
                if(low <= num && high >= num){
                    res.add(num);
                }
            }
        }
        
        return res;
    }
}