class Solution {
    public int countKeyChanges(String s) {
        
        String c = s.toLowerCase();
        int count=0;
        for(int t=1;t<c.length();t++){
            if(c.charAt(t)!=c.charAt(t-1)){
                count++;
            }
            
        }
        return count;
    }
}