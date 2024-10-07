class Solution {
    public boolean bfs(List<List<Integer>> l,boolean visited[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        visited[0]=true;
        while(!q.isEmpty()){
            int e=q.poll();
            List<Integer> arr=l.get(e);
            for(int i:arr){
                if(!visited[i]){
                    q.add(i);
                    visited[i]=true;
                }
            }
        }
        for(boolean u:visited){
            if(!u){
                return false;
            }
        }
        return true;
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean visited [] = new boolean[rooms.size()];
        return bfs(rooms,visited);
        
    }
}