HashMap<Integer, Integer> map = new HashMap<>();
for(String x : words){
map.put(x, map.getOrDefault(x, 0)+1);
}
​
## PriorityQueue
```
PriorityQueue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((a,b) -> {
int freqComparison = Integer.compare(b.getValue(), a.getValue());
// If frequencies are the same, compare by lexical order
if (freqComparison == 0) {
return a.getKey().compareTo(b.getKey());
}
return freqComparison;
});
```