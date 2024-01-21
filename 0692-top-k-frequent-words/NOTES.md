HashMap<Integer, Integer> map = new HashMap<>();
for(String x : words){
map.put(x, map.getOrDefault(x, 0)+1);
}
​
PriorityQueue<> pq = new PriorityQueue<>((a,b) -> );