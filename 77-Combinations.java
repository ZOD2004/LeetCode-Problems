class Solution {
    public void fun(int k,int ind,boolean []a,List<Integer>l,List<List<Integer>>ans){
        if(l.size() == k){
            ans.add(new ArrayList<>(l));
            return;
        }
        if (ind > a.length) return;
        for(int i=ind;i<a.length;i++){
                if(!a[i]){
                    a[i]=true;
                    l.add(i);
                    fun(k,i+1,a,l,ans);
                    l.remove(l.size()-1);
                    a[i]=false;
                }
            }
    }

    public List<List<Integer>> combine(int n, int k) {
        boolean a[] = new boolean[n+1];
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        fun(k, 1, a, l, ans);
        return ans;
    }
}