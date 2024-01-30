class Solution {
    public int minOperations(String[] logs) {
        Stack<String> x = new Stack<>();
        
        for(String log:logs){
            if(log.equals("../")){
                if(!x.isEmpty()) x.pop();
                else continue;
            }else if(log.equals("./")){
                continue;
            }else{
                x.push(log);
            }
        }
        
        return x.size();
    }
}