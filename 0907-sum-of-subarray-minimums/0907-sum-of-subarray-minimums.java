class Solution {
    
    int sum = 0;
    
    public int sumSubarrayMins1(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++){
             List<Integer> x  = new ArrayList<>();
            x.add(arr[i]);
            sum += Collections.min(x);
            for(int j=i+1;j<n;j++){
                x.add(arr[j]);
                sum += Collections.min(x);
            } 
        }
        return sum;
    }
    
    public int sumSubarrayMins2(int[] arr) {
        int n = arr.length;
        int min=0;
        int M = 1000000007;
        int s = 0;
         for(int i=0;i<n;i++){
             s =  (s % M+ arr[i])%M;
             // min = Math.min(min, arr[i]);
         }
        s = s%M;
        for(int i=0;i<n;i++){
            min = arr[i];
          for(int j=i+1;j<n;j++){
               min = Math.min(min, arr[j]);
               s = s%M  +  min;
            } 
        }
        return sum >= Integer.MAX_VALUE ? (int)s%M : s;
    }
        
    public int sumSubarrayMins(int[] arr) {
    final int kMod = 1_000_000_007;
    final int n = arr.length;
    long ans = 0;

    int[] prevMin = new int[n];
    int[] nextMin = new int[n];
    Deque<Integer> stack = new ArrayDeque<>();

    Arrays.fill(prevMin, -1);
    Arrays.fill(nextMin, n);

    for (int i = 0; i < arr.length; ++i) {
      while (!stack.isEmpty() && arr[stack.peek()] > arr[i]) {
        final int index = stack.pop();
        nextMin[index] = i;
      }
      if (!stack.isEmpty()){
        prevMin[i] = stack.peek();
      }
      stack.push(i);
    }

    for (int i = 0; i < arr.length; ++i) {
      ans += (long) arr[i] * (i - prevMin[i]) * (nextMin[i] - i);
      ans %= kMod;
    }

    return (int) ans;
  }

}