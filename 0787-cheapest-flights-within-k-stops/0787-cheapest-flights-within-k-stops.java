class Solution {
    public int findCheapestPrice1(int n, int[][] flights, int src, int dst, int k) {
         Map<Integer,List<int[]>> map=new HashMap<>();
        for(int[] i:flights)
        {
            map.putIfAbsent(i[0],new ArrayList<>());
            map.get(i[0]).add(new int[]{i[1],i[2]});
        }
        int step=0;
        Queue<int[]> q=new LinkedList<>();
        q.offer(new int[]{src,0});
        int ans=Integer.MAX_VALUE;
        while(!q.isEmpty())
        {
            int size=q.size();
            for(int i=0;i<size;i++)
            {
                int[] curr=q.poll();
                if(curr[0]==dst)
                    ans=Math.min(ans,curr[1]);
                if(!map.containsKey(curr[0]))
                    continue;
                for(int[] f:map.get(curr[0]))
                {
                    if(curr[1]+f[1]>ans)      //Pruning
                        continue;
                    q.offer(new int[]{f[0],curr[1]+f[1]});
                }
            }
            if(step++>k)
                break;
        }
        return ans==Integer.MAX_VALUE?-1:ans;
 
    }
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int K)
    {
        int[] cost=new int[n];
        Arrays.fill(cost,Integer.MAX_VALUE);
        cost[src]=0;
        for(int i=0;i<=K;i++)
        {
            int[] temp= Arrays.copyOf(cost,n);
            for(int[] f: flights)
            {
                int curr=f[0],next=f[1],price=f[2];
                if(cost[curr]==Integer.MAX_VALUE)
                    continue;
                temp[next]=Math.min(temp[next],cost[curr]+price);
            }
            cost=temp;
        }
        return cost[dst]==Integer.MAX_VALUE?-1:cost[dst];
    }
}