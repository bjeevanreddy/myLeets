class Solution {
    public boolean winnerOfGame(String colors) {
        
        // String s = "";
        if(colors.length()<3){
            return false;
        }
        // for(int i=0;i<3;i++){
        //     s+=colors.charAt(i);
        // }
        int a=0;
        int b=0;
//         int abc = isSame(s);
        
        
        for(int i=0;i<colors.length()-2;i++){
            String temp = colors.substring(i, i+3);
            int abc = isSame(temp);
            if(abc == 1) {
             a++;
            } if(abc==2) {
                b++;
            }
            
            if(abc==-1){
                continue;
            }
            
        }
        return a>b;
        
    }
    
    int isSame(String s){
        if(s.charAt(0)=='A' && s.charAt(1)=='A' && s.charAt(2)=='A'){
            return 1;
        }
        if(s.charAt(0)=='B' && s.charAt(1)=='B' && s.charAt(2)=='B'){
            return 2;
        }
        
        return -1;
    }
}