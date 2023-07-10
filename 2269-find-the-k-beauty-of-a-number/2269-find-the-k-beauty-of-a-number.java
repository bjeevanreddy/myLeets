class Solution {
    public int divisorSubstrings(int num, int k) {
        String val = String.valueOf(num);
        
        if(val.length()==k) return 1;
        int j=0;
        int i=0;
        int count=0;
        while(j<val.length()){
            if(j-i+1 <k){
                j++;
            }
            if(j-i+1>=k){
                String div = val.substring(i,i+k);
                // if(div.charAt(0)=='0'){
                //     val= div.substring(1);
                // }
                int number = Integer.parseInt(div);
                if(number!=0 && num%number==0) count++;
                 i++;
                j++;
            }
           
            // j++;
        }
        return count;
    }
}