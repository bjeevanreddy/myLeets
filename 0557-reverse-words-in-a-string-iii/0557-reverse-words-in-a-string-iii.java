class Solution {
    public String reverseWords(String s) {
        
        StringBuilder sb = new StringBuilder();
        String temp = new String();
        for(char c:s.toCharArray()){
            if(c!=' '){
                temp= c+temp;
            }else{
                sb.append(temp);
                sb.append(" ");
                temp="";
            }
           
        }
        
        return sb.append(temp).toString();
    }
}