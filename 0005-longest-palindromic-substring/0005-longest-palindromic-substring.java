class Solution {
//      int start =0;
//      int end = 0;
//     int max =0;
//     public String longestPalindrome1(String s) {
       
        
//     findLongest(s,0,s.length()-1);
//     return s.substring(start,end+1); 
        
//     }
//     // TLzE
//     void findLongest(String s,int l,int e){
        
//         if(l>=e || l>=s.length() || e>=s.length()){
//            return;
//         }
//          if(isPalin(s,l,e)){
//              if(max < e-l+1){
//                  max= e-l+1;
//                   start = l;
//                     end = e;
//              }
//          }
//             findLongest(s, l+1,e );
//             findLongest(s, l,e-1);
//     }
    
//     boolean isPalin(String s,int l,int e){
//         // System.out.println("l: "+l+"e: "+e);
//        while(l<e){
//           if(s.charAt(l)!=s.charAt(e)){ 
//               return false;
//           }
//            l++;
//            e--;
//        }
//         return true;
//     }
    
//      public String longestPalindrome2(String s) {
//         if (s == null || s.length() < 1) {
//             return "";
//         }
//         int start = 0;
//         int end = 0;

//         for (int i = 0; i < s.length(); i++) {
//             int len1 = expandAroundCenter(s, i, i);
//             int len2 = expandAroundCenter(s, i, i + 1);
//             int maxLength = Math.max(len1, len2);

//             if (maxLength > end - start) {
//                 start = i - (maxLength - 1) / 2;
//                 end = i + maxLength / 2;
//             }
//         }
//         return s.substring(start, end + 1);
//     }
//     private int expandAroundCenter(String s, int left, int right) {
//         while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
//             left--;
//             right++;
//         }
//         return right - left - 1;
//     }
    
    
     public String longestPalindrome(String s) {
         
         //babad
         int begin = 0;
        int last = 0;
         for(int i=0;i<s.length();i++){
             int even = findEven(s, i, i+1);
             int odd = findEven(s, i, i);
             int maxL= Math.max(even, odd);    
             if(maxL>last-begin){
                 begin = i - (maxL-1)/2;
                 last = i + maxL/2;
             } 
         }
         return s.substring(begin, last+1);
         
     }
    
    static int findEven(String s, int st, int e){
        
        while(st>=0 && e<s.length() && s.charAt(st)==s.charAt(e)){
            st--;
            e++;
        }
        
        return e-st-1;
    }
}