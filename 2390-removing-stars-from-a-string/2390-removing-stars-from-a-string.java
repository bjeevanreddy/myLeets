class Solution {
    public String removeStars1(String s) {
        String rsult="";
        Stack<Character> x = new Stack<>();
        
        for(char c:s.toCharArray()){
            
            if(c!='*'){
                x.push(c);
            }
            else{
                x.pop();
            }
        }
        while(!x.isEmpty()){
            rsult = x.pop() + rsult;
        }
        return rsult;
    }
    
     public String removeStars(String s) {
        String ans="";
        int cntStar=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i)=='*') cntStar++;
            else if(cntStar==0) ans=s.charAt(i)+ans;
            else cntStar--;
        }
        return ans;
    }
}