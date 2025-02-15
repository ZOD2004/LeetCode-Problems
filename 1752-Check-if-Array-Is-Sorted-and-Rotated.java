class Solution {
    public void rev(int l,int r,int []a){
        while(l<r){
            int t=a[l];
            a[l]=a[r];
            a[r]=t;
            l++;
            r--;
        }
    }
    public boolean check(int[] a) {
        int ind=-1;
        for(int i=0;i<a.length-1;i++){
            if(a[i+1]<a[i]){
                ind=i+1;
                break;
            }
        }
        if(ind == -1)return true;
        // System.out.println(ind);
        rev(0,ind-1,a);
        rev(ind,a.length-1,a);
        for(int i=0;i<a.length-1;i++){
            if(a[i]<a[i+1])return false;
        }
        return true;
    }
}