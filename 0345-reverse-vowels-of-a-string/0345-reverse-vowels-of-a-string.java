class Solution {
    public String reverseVowels(String s) {
        
        
        int b=0;
        int l=s.length()-1;
        char[] c= s.toCharArray();
        while(b<l){
            // while(b<l && !isVowel(c[b])){
            //     b++;
            // }
            // while(b<l && !isVowel(c[l])){
            //     l--;
            // }
            if(b<l && !isVowel(c[b])){
                b++;
                continue;
            }
            if(b<l && !isVowel(c[l])){
                l--;
                continue;
            }
            swap(b,l,c);
            b++;
            l--;         
        } 
        return String.valueOf(c);
    }
    
    
    static void swap(int b, int l, char[] c){
        char t= c[b];
        c[b]=c[l];
        c[l]=t;
    }
    
    static boolean isVowel(char c){
        
        // char c = (c1>=65 || c1<=90 ) ? (char)(c1+32) : c1;
        if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u' || c=='A' || c=='E' || c=='I' || c=='O'|| c=='U'){
            return true;
        }
        return false;
    }
}