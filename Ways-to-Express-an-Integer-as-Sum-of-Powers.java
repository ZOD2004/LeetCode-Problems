class Solution {
    static int mod = 1000000007;

    public int fun(int n, int x, int curr,int dp[][]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0 || Math.pow(curr, x) > n) return 0;

        if(dp[n][curr] != -1){
            return dp[n][curr];
        }

        int a = fun(n - (int)Math.pow(curr, x), x, curr + 1,dp);

        int b = fun(n, x, curr + 1,dp);
        return dp[n][curr] = (int)((long)(a+b)%mod);
    }

    public int numberOfWays(int n, int x) {
        // ans = 0;
        int max = (int)Math.pow(n, 1.0 / x) + 1;
        int dp[][]=new int[n+1][max+2];
        for(int i[]:dp){
            Arrays.fill(i,-1);
        }
        return fun(n, x, 1,dp);
        // return ans;
    }
}
