class Solution {
    public boolean canFinish(int n, int[][] pre) {
        int in[]=new int[n];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<Integer>());
        for(int i[]:pre){
            adj.get(i[0]).add(i[1]);
        }
        for(ArrayList<Integer> l:adj){
            // System.out.println(l);
            for(int i:l){
                in[i]++;
            }
        }
        // System.out.println(Arrays.toString(in));
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<in.length;i++){
            if(in[i] == 0){
                q.offer(i);
            }
        }
        // int ans[]=new int[adj.size()];
        int k=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            // ans[k++]=curr;
            k++;
            for(int i:adj.get(curr)){
                in[i]--;
                if(in[i] == 0){
                    q.add(i);
                }
            }
        }
        // System.out.println(Arrays.toString(ans));
        return (k == n);
    }
}