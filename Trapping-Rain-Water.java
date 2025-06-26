class Solution {
    public int trap(int[] h) {
        int lm=0,rm=0,l=0,r=h.length-1;
        int tot=0;
        while(l<r){
            if(h[l]<=h[r]){
                if(h[l]<lm){
                    tot+=lm-h[l];
                }
                else{
                    lm=h[l];
                }
                l++;
            }
            else{
                if(h[r]<rm){
                    tot+=rm-h[r];
                }
                else{
                    rm=h[r];
                }
                r--;
            }
        }
        return tot;
    }
}