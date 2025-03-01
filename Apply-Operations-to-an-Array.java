class Solution {
    public int[] applyOperations(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i] == nums[i+1]){
                nums[i]*=2;
                nums[i+1]=0;
            }
        }
        int []a=new int [n];
        int r=0;
        for(int f:nums){
            if(f != 0){
                a[r++]=f;
            }
        }
        return a;
    }
}