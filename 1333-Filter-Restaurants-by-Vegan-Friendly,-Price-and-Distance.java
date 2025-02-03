class Solution {
    public List<Integer> filterRestaurants(int[][] r, int veganFriendly, int maxPrice, int maxDistance) {
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->{
            if(b[1] == a[1]){
                return b[0]-a[0];
            }
            return b[1]-a[1];
        });
        for(int i[]:r){
            if (i[2] >= veganFriendly && i[3] <= maxPrice && i[4] <= maxDistance)
            pq.add(i);
        }
        ArrayList<Integer>l=new ArrayList<>();
        while(!pq.isEmpty()){
            l.add(pq.poll()[0]);
        }
        return l;
    }
}