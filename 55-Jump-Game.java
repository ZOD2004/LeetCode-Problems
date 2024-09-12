class Solution {
    public boolean canJump(int[] nums) {
        int max=0;
        int l=nums.length-1;
        for(int i=0;i<=l;i++){
            if(i>max){
                return false;
            }
            max=Math.max(max,(i+nums[i]));
            // System.out.println("i "+i+" max="+max);         
        }
        return true;
    }
}