class Solution {
    public boolean rotateString(String X, String Y) {
        
        // one test case failed
        
        // for X="abcde"  Y="abced" 
//         if(X=="" || Y==""){
// 			return false;
// 		}
// 		if(X.length()!=Y.length()){
// 			return false;
// 		}
// 		int[] count = new int[256];
// 		for(int i=0;i<X.length();i++){
// 			 count[X.charAt(i)]++;
// 			 count[Y.charAt(i)]--;
// 		}
// 		for(int i:count){
// 			if(i>0){
// 				return false;
// 			}else{
                
//             }
// 		}
		
// 		return true;
//     }
    
    
    ///normal method
    int x= X.length();
    int y=Y.length();
    
    int i=0;
    while(i<x){
        X=X.substring(1)+X.charAt(0);
        if(X.equals(Y)){
            return true;
        }
        i++;
    }
    return false;
}
}