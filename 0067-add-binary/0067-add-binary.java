class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length()-1;
        int j=  b.length()-1;
        StringBuilder sb= new StringBuilder();
        int carry=0;
        while(i>=0 || j>=0){
            int sum=carry;
            if(j>=0){
                sum = sum + b.charAt(j)-'0';
                j--;
            }
            if(i>=0){
                sum = sum + a.charAt(i)-'0';
                i--;
            }
            
            sb.append(sum%2);
            carry = sum/2;
        }
        
        if(carry!=0){
            sb.append(carry);
        }
        
        return sb.reverse().toString();
        
    }
}

