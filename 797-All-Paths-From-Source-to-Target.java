class Solution {
    public void dfs(int [][]g, int s,int d,List<List<Integer>>ans,ArrayList<Integer> ds){
        ds.add(s);
        if(s == d){
            ans.add(new ArrayList<Integer>(ds));
            ds.remove(ds.size()-1);
            return;
        }
        for(int i:g[s]){
            dfs(g,i,d,ans,ds);
        }
        ds.remove(ds.size()-1);
        
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] g) {
        int s=0;
        int d=g.length-1;
        ArrayList<List<Integer>>ans=new ArrayList<List<Integer>>();
        ArrayList<Integer> ds=new ArrayList<Integer>();
        dfs(g,s,d,ans,ds);
        return ans;
    }
}