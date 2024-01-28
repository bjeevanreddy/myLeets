class Solution {
    public List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        
        PriorityQueue<Integer> queue = new PriorityQueue<>((a,b) ->{
            int[] one = restaurants[a];
            int[] two = restaurants[b];
            
            int fre = two[1] - one[1];
            
            if(fre==0){
                return two[0] - one[0];
            }
            return fre;
        });
        
        for(int i=0;i<restaurants.length;i++){
            int r[] = restaurants[i];
            if(veganFriendly==1 && r[2]==1){
                if(r[3]<=maxPrice && r[4]<= maxDistance){
                    queue.offer(i);
                }
            }
            
            if(veganFriendly==0){
                if(r[3]<=maxPrice && r[4]<= maxDistance){
                    queue.offer(i);
                }
            }
        }
        List<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            result.add(restaurants[queue.poll()][0]);
        }
        return result;
    }
}