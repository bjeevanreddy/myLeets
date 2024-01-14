class Solution {
    public int numDecodings(String s) {
        
//         HashMap<Character, Integer> map = new HashMap<>();
        
//         for(char i='A';i<='Z';i++){
//             map.put(i, (i-'A') + 1);
//         }
        int[] map = new int[s.length()+1];
       
            Arrays.fill(map,-1);
        return helper(map, s, 0);
    }
    
    int helper(int[] map, String s, int start){
        
        if(s.length()==0) return 0;
        if (start == s.length()) {
		    return 1;
	        }
        if (s.charAt(start) == '0') {
            return 0;
        }
        if(map[start]!=-1) return map[start];
        int single = helper(map,s, start+1);
        int two =0;
        if(start < s.length()-1 && Integer.parseInt(s.substring(start, start+2))<=26){
             two = helper(map,s, start+2);
        }
       
        return map[start] = single+two;
      
        
       
        
    }
    
}

// 11106