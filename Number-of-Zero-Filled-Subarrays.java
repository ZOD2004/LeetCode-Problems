class Solution {
    public long zeroFilledSubarray(int[] nums) {
        // int a[]=new int[100002];
        int c=0;
        long ans=0;
        for(int i=0;i<nums.length;i++){
            // System.out.println(c);
            if(nums[i] == 0){
                c++;
                ans+=c;
            }
            else{
                c=0;
            }
        }
        
        // for(int i:a){
        //     if(i>0)
        //     ans+=i;
        // }
        return ans;
    }
}