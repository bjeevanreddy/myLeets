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
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            String a = strs[i];
            boolean skip = false;
            for(List<String> r:result){
                if(r.contains(a)){
                    skip = true;
                    break;
                }
            }
            if(skip){
                continue;
            }
            List<String> temp = new ArrayList<>();
            temp.add(a);
            for(int j=i+1;j<strs.length;j++){
                String b = strs[j];
                if( findA( a, b)){
                    temp.add(b);
                }
            }
            result.add(temp);
        }
       return result;
    }
}