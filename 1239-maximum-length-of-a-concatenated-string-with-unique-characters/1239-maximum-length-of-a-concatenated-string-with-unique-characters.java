class Solution {
    public int maxLength(List<String> arr) {
        return solve(arr, 0, "");
    }
    
    int solve(List<String> arr, int start, String temp){
        if(start>=arr.size()){
            if(!isGood(temp)){
                return 0;
            }
            return temp.length();
        }
        
       
        int pick = 0;
        int notpick =0;
        // if(contains(temp, arr.get(start))){
            pick = solve(arr, start+1, temp+arr.get(start));
        // }
        notpick =  solve(arr, start+1, temp);
        return Math.max(pick,notpick);
    }
    
    boolean contains(String one, String two){
        int[] x= new int[26];
        
        for(char c:one.toCharArray()){
            x[c-'a']++;
        }
        for(char c:two.toCharArray()){
            if(x[c-'a']!=0){
                return false;
            }
        }
        return true;
    }
    boolean isGood(String one){
        int[] x= new int[26];
        for(char c:one.toCharArray()){
            x[c-'a']++;
            if(x[c-'a']>1){
                return false;
            }
        }
         return true;
     }
}