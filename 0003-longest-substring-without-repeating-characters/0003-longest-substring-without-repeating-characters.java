class Solution {
    public int lengthOfLongestSubstring(String s) {

        Set<Character> set= new HashSet<>();
        int len = 0;
        int start=0;
        int right =0;
        if(s.length()==1 ){
            return 1;
        }
        if(s== "" || s==null){
            return 0;
        }
        char[] chars = s.toCharArray();
        // for(char c=0;c<chars.length;c++){
        //     if(!set.contains(chars[c])){
        //         set.add(chars[c]);
        //         len = Math.max(len,set.size());
        //     }else{
        //         set.remove(chars[start]);
        //         start++;
        //         // set.add(chars[c]); 
        //         c--;   
        //    }
          
        // }
         for (int e = 0; e < s.length(); e++) {
            while(!set.add(s.charAt(e))) {
                set.remove(s.charAt(start++));
            }
            len = Math.max(len, e - start + 1);
        }
        return len;

        
    }

//     while(right<s.length()){
//         if(set.contains(chars[right])){
//             set.remove(chars[start]);
//             start++;
//         }
//         else{
//             set.add(chars[right++]);
//             len = Math.max(len,set.size());
//         }
//     }
//     return len;
// }
    
    public int lengthOfLongestSubstring2(String s) {
        Set<Character> set = new HashSet<>();
        
        int b=0;
        int e=0;
        int max =Integer.MIN_VALUE;
        if(s==""|| s==null){
            return 0;
        }
        int n = s.length();
        while(e<n){
            while(e<n && set.add(s.charAt(e))){
                max= Math.max(max, e-b+1);
                e++;
            }
            set.remove(s.charAt(b));
            b++;
        }
        return max==Integer.MIN_VALUE ?0:max;
    }
    
    public int lengthOfLongestSubstring3(String s){
        int max = 0;
        Set<Character> set = new HashSet<>();
        int j=0;
        for(int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                while(j<i && s.charAt(j)!=s.charAt(i)){
                    set.remove(s.charAt(j));
                    j++;
                }
                j++;
            }
            set.add(s.charAt(i));
            max = Math.max(max,set.size());
        }
        return max;
    }
}