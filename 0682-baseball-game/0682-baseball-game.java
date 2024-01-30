class Solution {
    public int calPoints(String[] operations) {
        
        Stack<Integer> x = new Stack<>();
        int cum=0;
        for(String op :operations){
            
            if(op.equals("C")){
                // cum-=x.pop();
                x.pop();
            }
            else if(op.equals("D")){
                x.push(x.peek()*2);
                // cum+=x.peek()*2;
            }
             else if(op.equals("+")){
                    int one = x.pop();
                    int two = x.pop();
                    x.push(two);
                    x.push(one);
                    x.push(one+two); 
                System.out.println(x);
                // cum=2*cum;
            }
            
            else{
                x.push(Integer.valueOf(op));
                // cum+=Integer.valueOf(op);
            }
        }
        
        
        while(!x.isEmpty()){
            cum+=x.pop();
        }
        return cum;
    }
}