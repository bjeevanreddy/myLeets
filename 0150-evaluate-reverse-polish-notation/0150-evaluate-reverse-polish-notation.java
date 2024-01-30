class Solution {
    public int evalRPN1(String[] tokens) {
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
    
    public int evalRPN(String[] tokens) {
    int a,b;
		Stack<Integer> S = new Stack<Integer>();
		for (String s : tokens) {
			if(s.equals("+")) {
				S.add(S.pop()+S.pop());
			}
			else if(s.equals("/")) {
				b = S.pop();
				a = S.pop();
				S.add(a / b);
			}
			else if(s.equals("*")) {
				S.add(S.pop() * S.pop());
			}
			else if(s.equals("-")) {
				b = S.pop();
				a = S.pop();
				S.add(a - b);
			}
			else {
				S.add(Integer.parseInt(s));
			}
		}	
		return S.pop();
	}
}