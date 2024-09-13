class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int ans[]=new int[queries.length];
        int pre[]=new int [arr.length];
        pre[0]=arr[0];
        for(int i=1;i<arr.length;i++){
            pre[i]=pre[i-1]^arr[i];
        } 
        int g=0;
        for (int i = 0; i < ans.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            if (start == 0) {
                ans[i] = pre[end];
            } else {
                ans[i] = pre[end] ^ pre[start - 1];
            }
        }
        return ans;
    }
}