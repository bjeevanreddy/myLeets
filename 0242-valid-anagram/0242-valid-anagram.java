class Solution {
    public boolean isAnagram(String X, String Y) {
        	if(X.length()!= Y.length()){
				return false;
			}
			if(X==null || Y==null){
				return false;
			}
			
			HashMap<Character,Integer> map= new HashMap<>();
			
			
			for(int i=0;i<X.length();i++){
				map.put(X.charAt(i),map.getOrDefault(X.charAt(i),0)+1);
			}
			
			for(int i=0;i<Y.length();i++){
				if(!map.containsKey(Y.charAt(i))){
					return false;
				}
				else{
                    if( map.get(Y.charAt(i))!=null && map.get(Y.charAt(i))==1){
                        map.remove(Y.charAt(i));
                    }
					else map.put(Y.charAt(i),map.get(Y.charAt(i))-1);
				}
			}
		
		
		// for(Map.Entry<Character, Integer> entry: map.entrySet()){
		// 	if(entry.getValue()!=0){
		// 		return false;
		// 	}
		// }
		
		return map.isEmpty();
			
	}
    
    public boolean isAnagram1(String X, String Y) {
        	
		
			if(X.length()!= Y.length()){
				return false;
			}
			if(X==null || Y==null){
				return false;
			}
			
			int[] count = new int[26];
			for(int i=0;i<X.length();i++){
				
				count[X.charAt(i)-'a']++;
				count[Y.charAt(i)-'a']--;
			}
			
			for(int i:count){
				if(i!=0){
					return false;
				}
			}
			
			return true;
			
			
	}
}