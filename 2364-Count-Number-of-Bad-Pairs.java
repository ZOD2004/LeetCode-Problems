class Solution {
    public long countBadPairs(int[] nums) {
        long c=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int curr=nums[i]-i;
            if(map.containsKey(curr)){
                c+=map.get(curr);
            }
            map.put(curr,map.getOrDefault(curr,0)+1);
        }
        long n=nums.length;
        return ((n*(n-1))/2)-c;
    }
}