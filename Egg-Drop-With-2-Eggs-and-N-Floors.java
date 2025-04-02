class Solution {
    public int fun(int n){
        int curr=(n*(n+1))/2;
            return curr;
    }
    public int twoEggDrop(int n) {
        int l=0;
        int h=n;
        while(l<=h){
            int mid=(l+h)/2;
            if(fun(mid)>=n && fun(mid-1)<n){
                return mid;
            }
            else if(fun(mid)>n){
                h=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return 0;
    }
}