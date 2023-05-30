class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map =  new HashMap<>();
      map.put('I',1);
      map.put('V',5);
      map.put('X',10);
      map.put('L',50);
      map.put('C',100);
      map.put('D',500);
      map.put('M',1000);
      // VIII - 8
      // IX
      int sum = map.get(s.charAt(0));
      for(int i=1;i<s.length();i++){
          if(map.get(s.charAt(i))>map.get(s.charAt(i-1))){
             
              sum = sum - 2*map.get(s.charAt(i-1)) + map.get(s.charAt(i));
              
          }
          else{
              sum+=map.get(s.charAt(i));
              
          }
      }
        return sum;
    }
}