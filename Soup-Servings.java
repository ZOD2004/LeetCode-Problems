class Solution {
    public double fun(int a,int b,double dp[][]){
        if(a<=0 && b<=0){
            return 0.5;
        }
        else if(a<=0 && b>0){
            return 1;
        }
        else if(b<=0 && a>0){
            return 0;
        }
        if(dp[a/25][b/25] != -1)return dp[a/25][b/25];
        
        double x=0.25*(fun(a-100,b-0,dp));
        double y=0.25*(fun(a-75,b-25,dp));
        double z=0.25*(fun(a-50,b-50,dp));
        double v=0.25*(fun(a-25,b-75,dp));
        return dp[a/25][b/25] = x+y+z+v;
    }
    public double soupServings(int n) {
        int a=n;
        int b=n;
        if(n>=5000)
        return 1;
        double dp[][]=new double [(n+25)/25][(n+25)/25];
        for(double []i:dp){
            Arrays.fill(i,-1);
        }
        return fun(a,b,dp);
    }
}