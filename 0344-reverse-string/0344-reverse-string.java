class Solution {
    public void reverseString(char[] s) {
        
        
        int b=0;
        
        int e=s.length-1;
        
        while(b<e){  
            swap(b++,e--,s);
        }
    }
    
    static void swap(int b,int e,char[] s){
        char temp=s[b];
        s[b]= s[e];
        s[e]=temp;
    }
}