class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxa=0,maxab=0,res=0;
        for(int i:nums){
            res=Math.max(res,maxab*1L*i);
            maxab=Math.max(maxab,maxa-i);
            maxa=Math.max(maxa,i);
        }
        return res;
    }
}