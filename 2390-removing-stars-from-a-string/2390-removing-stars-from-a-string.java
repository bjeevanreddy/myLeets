class Solution {
    public String removeStars(String s) {
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
}