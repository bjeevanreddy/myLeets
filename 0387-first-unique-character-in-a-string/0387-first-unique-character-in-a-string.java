class Solution {
    public int firstUniqChar(String s) {
        
        
        int b=0;
        int[] arr=new int[26];
        
        Map<Character,Integer> map = new HashMap<>();
        
        while(b<s.length()){
            
            map.put(s.charAt(b), map.getOrDefault(s.charAt(b),0)+1);
            b++;
        }
    
        for(int i=0;i<s.length();i++){
            if(map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }
}