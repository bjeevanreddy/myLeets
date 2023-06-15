class Solution {
    public String longestCommonPrefix1(String[] words) {
        // sort strs to have least number of characters in first word
        Arrays.sort(words);
        // capture firstString to compare
        String firstString = words[0];
        for(int j=0;j< firstString.length();j++){
            for(int i=1;i<words.length;i++){
                // Check if character at j is same in all other words, if not return string till previous character
                if(firstString.charAt(j)!=words[i].charAt(j))
                    return firstString.substring(0,j);
            }
        }
        // return if there is only one word or one character
        return words[0];
    }
    
     public String longestCommonPrefix(String[] words) {
        int len=words.length;
		if(len==0) return "";
		String main= words[0];
		if(len==1){
			return main;
		}
		int lastIndex=0;
		for (int i=0;i<main.length() ;i++ ){
			
			char ch = main.charAt(i); // t,e,c,h,n,i
			
			for(int j=1;j<len;j++){
				if(i>=words[j].length() || words[j].charAt(i)!=ch){
					return main.substring(0,i);
				}
				else{
				
					continue;
				}
			}
		}
		return main;
    }
    
}