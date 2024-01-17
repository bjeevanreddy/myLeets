class Solution {
    public boolean closeStrings(String word1, String word2) {
        
        int[] arr = new int[26];
        int[] arr1 = new int[26];
        for(char c: word1.toCharArray()){
            arr[c-'a']++;
        }
        
        for(char c: word2.toCharArray()){
            arr1[c-'a']++;
        }
         for (int i = 0; i < 26; i++) {
            if ((arr[i] == 0 && arr1[i] != 0) || (arr[i] != 0 && arr1[i] == 0)) {
                return false;
            }
        }
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        for(int i=0;i<arr.length;i++ ){
            if(arr[i]!=arr1[i]){
                return false;
            }
        }
        return true;
        
        
    }
}