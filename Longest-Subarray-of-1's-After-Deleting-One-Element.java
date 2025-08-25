class Solution {
    public int longestSubarray(int[] nums) {
        int []suf=new int[nums.length];
        int n=nums.length;
        suf[n-1]=nums[n-1];
        for(int i=n-2;i>=0;i--){
            if(nums[i] != 0){
                suf[i]=suf[i+1]+nums[i];
            }   
        }
        int pre=0;
        // boolean f=true;
        int max=0;
        for(int i=0;i<n-1;i++){
            if(nums[i] == 0){
                // System.out.println(pre);
                // System.out.println(pre+" == "+suf[i+1]);
                max=Math.max(max,pre+suf[i+1]);
                pre=0;
                continue;
            }
            pre++;
        }
        if(pre == n-1)return pre;
        return max;
    }
}