class Solution {
    public int BS1(int a[],int l,int h,int t){
        if(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==t){
                if(mid==0 || a[mid-1]!=t){
                    return mid;
                }
                else{
                    return BS1(a,l,mid-1,t);
                }
            }
            else if(t<a[mid]){
                return BS1(a,l,mid-1,t);
            }
            else{
                return BS1(a,mid+1,h,t);
            }
        }
        return -1;
    }
    public int BS2(int a[],int l,int h,int t){
        if(l<=h){
            int mid=(l+h)/2;
            if(a[mid]==t){
                if(mid==h || a[mid+1]!=t){
                    return mid;
                }
                else{
                    return BS2(a,mid+1,h,t);
                }
            }
            else if(t<a[mid]){
                return BS2(a,l,mid-1,t);
            }
            else{
                return BS2(a,mid+1,h,t);
            }
        }
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        // int ind=BS();
        if(nums.length==0)return new int[]{-1,-1};
        int ans[]=new int[2];
        ans[0]=BS1(nums,0,nums.length-1,target);
        ans[1]=BS2(nums,0,nums.length-1,target);
        return ans;
    }
}