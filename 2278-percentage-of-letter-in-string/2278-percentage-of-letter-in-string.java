class Solution {
    public int percentageLetter(String s, char letter) {
        int[] arr = new int[26];
        
        char[] arrc = s.toCharArray();
        int count=0;
        for(char c: arrc){
            
            arr[c-'a']++;
            if(c-letter==0 && arr[c-'a']!=0){
                count++;
            }
        }
        // System.out.println(count);
        return (count*100/s.length());
    }
}