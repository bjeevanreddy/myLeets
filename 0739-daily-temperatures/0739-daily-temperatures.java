class Solution {
    
    //TLE
//     public int[] dailyTemperatures(int[] temp) {
//         int n = temp.length;
//         // int s=0;
        
//         for(int i=0;i<n;i++){
//             int s=i+1;
//             while(s<n && temp[i]>=temp[s]){
//                 s++;
//                 continue;
//             }
//             if(s>=n){
//                 temp[i]=0;
//             }else{
//                 temp[i] = s-i;
//             }
//         }
        
//         return temp;
//     }

    
    // MONOTONIC STACK 
public int[] dailyTemperatures1(int[] temperatures) {
    
    int len = temperatures.length;
    int[] ans = new int[len];
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<len; i++) {
        while (!st.empty() && temperatures [st.peek()] <temperatures[i]) {
        // found an increasing value for st.peek() index
        ans [st.peek()] = i - st. peek();
        st.pop();
        }
    st.push(i);
    }
    return ans;
    }
    
    public int[] dailyTemperatures(int[] temperatures){
        Stack<Integer> x = new Stack<>();
        int[] arr= new int[temperatures.length];
        for(int i=0;i<temperatures.length;i++){
            
            while(!x.isEmpty() && temperatures[x.peek()] < temperatures[i]){
                
                arr[x.peek()] = i - x.peek();
                x.pop();
            }
            
            x.push(i);
        }
        
        return arr;
    }
}