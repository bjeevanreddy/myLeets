class Solution {
    
    //TLE
    public boolean wordBreak1(String s, List<String> wordDict) {
        
        
        if(s.length()==0){
            return true;
        }
        
        
        for(int i=1;i<=s.length();i++){
            
            if(wordDict.contains(s.substring(0,i)) && wordBreak(s.substring(i,s.length()),wordDict)){
                return true;
            }
        }
        return false;
    }
    
    public boolean wordBreak(String s, List<String> wordDict) {
        
        
        
        int size = s.length();
        boolean[] wb = new boolean[size+1];
        
        for(int i=0;i<=size;i++){
            
            if(!wb[i] && wordDict.contains(s.substring(0,i))){
                wb[i]= true;
            }
            
            if(wb[i]){
                if(i==size){
                    return true;
                }
                
                for (int j = i+1; j <= size; j++)
            {
                // Update wb[j] if it is false and can be updated
                // Note the parameter passed to dictionaryContains() is
                // subString starting from index 'i' and length 'j-i'
                if (wb[j] == false && wordDict.contains( s.substring(i, j) ))
                    wb[j] = true;
 
                // If we reached the last character
                if (j == size && wb[j] == true)
                    return true;
            }
            }
        }
        
        return false;
        
        
    }
}