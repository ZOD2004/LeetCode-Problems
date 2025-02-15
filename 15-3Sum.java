class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        if(nums.length<3) return l;
        Arrays.sort(nums);
        int n=nums.length;
        for(int a=0;a<nums.length-2;a++){
            if(a>0 && nums[a] == nums[a-1]) continue;
            int b=a+1;
            int c=n-1;
            while(b<c){
                int sum=nums[a]+nums[b]+nums[c];                
                if(sum < 0){
                    b++;
                }
                else if(sum>0){
                    c--;
                }
                else{
                    l.add(Arrays.asList(nums[a],nums[b],nums[c]));
                    while(b<c && nums[b] == nums[b+1])b++;
                    while(b<c && nums[c] == nums[c-1])c--;
                    b++;c--;
                }

            }
        }
        return l;
    }
}