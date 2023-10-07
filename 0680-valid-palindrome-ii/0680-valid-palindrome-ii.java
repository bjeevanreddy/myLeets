class Solution {
    public boolean validPalindrome(String s) {
        
        if(s.length()==1){
            return true;
        }
        char[] arr = s.toCharArray();
        int i=0;
        int e=s.length()-1;
        return helper(arr, i,e);
    }
    
    boolean helper(char[] arr, int i, int e){
        while(i<e){
          
        if(arr[i]!=arr[e]){
            return isPalin(arr, i+1, e) || isPalin(arr, i, e-1);
        }
        i++;
        e--;
        }
          return true;
       
    }
    
    boolean isPalin(char[] arr, int i, int e){
        
        while(i<e){
            if(arr[i] != arr[e]){
                return false;
            }
            i++;
            e--;
        }
        return true;
    }
}