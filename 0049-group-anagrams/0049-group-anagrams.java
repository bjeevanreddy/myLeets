class Solution {
    static boolean findA(String X, String Y){
        int count[] = new int[26];
        if(X.length()!= Y.length()){
            return false;
        }
        
        int i=0;
        while(i<X.length()){
            count[X.charAt(i)-'a']++;
            count[Y.charAt(i)-'a']--;
            i++;
        }
        for(int j:count){
            if(j!=0){
                return false;
            }
        }
        return true;
    }
    public List<List<String>> groupAnagrams1(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String a = strs[i];
            boolean skip = false;
             var y = result.stream().flatMap(li -> li.stream()).collect(Collectors.toList());
            if(y.contains(a)){
                continue;
            }
            List<String> temp = new ArrayList<>();
            temp.add(a);
            for(int j=i+1;j<strs.length;j++){
                String b = strs[j];
                if(findA( a, b)){
                    temp.add(b);
                }
            }
            result.add(temp);
        }
       return result;
    }
    public List<List<String>> groupAnagrams2(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs){
            String key = buildKey(str);
            map.putIfAbsent(key, new LinkedList<>());
            map.get(key).add(str);
        }

        return new ArrayList<>(map.values());
    }

    private String buildKey(String s){
        char[] freq = new char[26];
        for (char c : s.toCharArray())
            freq[c - 'a']++;
        return new String (freq);
    }
    
    
    //pratcise
     public List<List<String>> groupAnagrams(String[] strs){
         Map<String, List<String>> result = new HashMap<>();
         
         for(String s: strs){
             String key = subElement(s);
             
             if(result.containsKey(key)){
                 List<String> x = result.get(key);
                 x.add(s);
                 result.put(key, x);
             }
             else{
                 List<String> x= new ArrayList<>();
                 x.add(s);
                 result.put(key, x);
             }
         }
         
        return new ArrayList<>(result.values());
     }
    
    private String subElement(String s){
        char[] y = s.toCharArray();
        Arrays.sort(y);
        return new String(y);
    }
    
    
    
}