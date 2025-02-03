class Solution {
    public int longestMonotonicSubarray(int[] a) {
        int max=1;
        int n=a.length;
        int ic=1,dc=1;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                ic++;
            }
            else{
                ic=1;
            }
            if(a[i]<a[i+1]){
                dc++;
            }
            else{
                dc=1;
            }
            max=Math.max(max,Math.max(dc,ic));

        }
        return max;
    }
}