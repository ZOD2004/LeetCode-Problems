class Solution {
    public int[] findOrder(int n, int[][] pre) {
        int ans[]=new int[n];
        int in[]=new int[n];
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        for(int i=0;i<n;i++)adj.add(new ArrayList<Integer>());
        for(int []t:pre){
            adj.get(t[1]).add(t[0]);
            in[t[0]]++;
        }
        int f=0;
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(in[i] == 0){
                q.offer(i);
            }
        }
        int k=0;
        while(!q.isEmpty()){
            int curr=q.poll();
            f++;
            ans[k++]=curr;
            for(int i:adj.get(curr)){
                in[i]--;
                if(in[i] == 0)q.add(i);
            }
        }
        return f == n?ans:new int[0];
    }
}