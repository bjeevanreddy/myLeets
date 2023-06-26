class Solution {
    public int countCharacters(String[] words, String chars) {
          int count=0;
        // map.forEach((k,v)-> System.out.print(k + ":"+v+"\n"));
        for(int i=0;i<words.length;i++){
            if(words[i].length()<=chars.length() && validate(words[i],chars) ){
                count+=words[i].length();
            }
        }
        
        return count;
    }
    
    boolean validate(String x,String chars){
        int i=0;
        HashMap<Character,Integer> map = new HashMap<>();
      
        for(char c: chars.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        while(i<x.length()){
            Character c = (Character)x.charAt(i);
            // System.out.print(c);
            if(map.containsKey(c) && map.get(c)>0 ){
                map.put(c, map.get(c)-1);
                i++;
            }else{
                    return false;
            }
        
        }
        
        return true;
    }
}