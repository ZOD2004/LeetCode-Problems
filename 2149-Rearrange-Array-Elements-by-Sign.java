class Solution {
    public int[] rearrangeArray(int[] nums) {
        int []a=new int [nums.length];
        int pos=0;
        int neg=1;
        for(int i:nums){
            if(i>0){
                a[pos]=i;
                pos+=2;
            }
            else{
                a[neg]=i;
                neg+=2;
            }
        }
        return a;
    }
}