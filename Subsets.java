class Solution {
    List<List<Integer>> l=new ArrayList<>();
    public void bt(int st,List<Integer> curr,int nums[]){
        l.add(curr);
        for(int i=st;i<nums.length;i++){
            curr.add(nums[i]);
            bt(i+1,new ArrayList<>(curr),nums);
            curr.remove(curr.size()-1);
        }
    }
    public List<List<Integer>> subsets(int[] nums) {
        bt(0,new ArrayList<>(),nums);
        return l;
    }
}