class Solution {
    public void fun(int nums[],List<List<Integer>>ans,boolean []a,List<Integer> l){
        if(l.size()==nums.length){
            ans.add(new ArrayList<Integer>(l));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!a[i]){
                l.add(nums[i]);
                a[i]=true;
                fun(nums,ans,a,l);
                a[i]=false;
                l.remove(l.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>l=new ArrayList<>();
        boolean a[]=new boolean[nums.length];
        fun(nums,ans,a,l);
        return ans;
    }
}