class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> map = new HashSet<>();
        int count=0;
        for(char  c : s.toCharArray()){
            if(map.remove(c)){
                count++;
            }else{
                map.add(c);
            }
        }
        
        return map.isEmpty() ? count*2 : count*2+1;
    }
}

/// madam 
// adda