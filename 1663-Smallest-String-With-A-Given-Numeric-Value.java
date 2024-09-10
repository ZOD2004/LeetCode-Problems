class Solution {
    public String getSmallestString(int n, int k) {
        int a[]=new int[n];
        Arrays.fill(a,1);
        k-=n;
        while(k>0){
            n--;
            if(k>=25){
                a[n]+=25;
                k-=25;
            }
            else{
                a[n]+=k;
                k=0;
            }
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i:a){
            sb.append((char)(i+96));
        }
        return sb.toString();

    }
}