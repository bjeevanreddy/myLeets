class Solution {
    public boolean backspaceCompare(String s, String t) {
        // a##c
        
        Stack<Character> x= new Stack<>();
        Stack<Character> y= new Stack<>();
        
        for(char c:s.toCharArray()){
            if(c!='#'){
               x.push(c) ;
            } else{
                if(!x.isEmpty()){
                    x.pop();
                }
            }
        }
        for(char c:t.toCharArray()){
            if(c!='#'){
               y.push(c) ;
            } else{
                if(!y.isEmpty()){
                    y.pop();
                }
            }
        }
        if(x.size()!=y.size()) return false;
        while(!x.isEmpty() && !y.isEmpty()){
            if(x.pop()!=y.pop()){
                return false;
            }
        }
        return true;
    }
}