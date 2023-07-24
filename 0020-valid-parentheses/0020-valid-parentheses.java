class Solution {
    public boolean isValid(String s) {
        Stack<Character> brackets = new Stack<>();
        
        if(s.length()<2) {
            return false;
        }
        
        for(char c: s.toCharArray()){
            
            switch(c){
                    
                case '(':
                    brackets.push(c);
                    break;
                case '{':
                    brackets.push(c);
                    break;
                case '[':
                    brackets.push(c);
                    break;
                case ')':
                    if(brackets.empty()|| brackets.peek()!='('){
                        return false;
                    }else{
                        brackets.pop();
                        break;
                    }
                case '}':
                    if(brackets.empty()|| brackets.peek()!='{'){
                        return false;
                    }else{
                        brackets.pop();
                        break;
                    }
                case ']':
                    if(brackets.empty()|| brackets.peek()!='['){
                        return false;
                    }else{
                        brackets.pop();
                        break;
                    }
                default: ;
            }
            
           
        }
         return brackets.isEmpty();
    }
}