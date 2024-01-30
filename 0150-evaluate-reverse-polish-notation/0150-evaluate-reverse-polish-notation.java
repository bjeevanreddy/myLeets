class Solution {
    public int evalRPN(String[] tokens) {
        int sum=0;
        Stack<Integer> x = new Stack<>();
        Stack<String> y = new Stack<>();
        
        
        
        for(int i=0;i<tokens.length;i++){
            
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("/") || tokens[i].equals("*")){
                y.push(tokens[i]);
            }else{
                x.push(Integer.valueOf(tokens[i]));
            }
            
            int s = x.size();
            
            while(s>=2 && !y.isEmpty()){
                String op= y.pop();
                int one = x.pop();
                int two = x.pop();
                switch(op){
                    case "+":
                        sum = two+one;
                        break;
                    case "-":
                        sum = two-one;
                        break;
                    case "/":
                        sum = two/one;
                        break;
                    case "*":
                        sum = two*one;
                        break;
                }
                x.push(sum);
                
            }
        }
        return !x.isEmpty() ? x.pop() : 0;
    }
}