class Solution {
    public static int his(int a[]) {
        int n = a.length;
        int[] ns = new int[n];
        int[] ps = new int[n];
        Stack<int[]> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek()[0] >= a[i]) {
                st.pop();
            }
            ns[i] = (st.isEmpty()) ? n : st.peek()[1];
            st.push(new int[] { a[i], i });
        }
        st.clear();
        // System.out.println(Arrays.toString(ns));
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && st.peek()[0] >= a[i]) {
                st.pop();
            }
            ps[i] = (st.isEmpty()) ? -1 : st.peek()[1];
            st.push(new int[] { a[i], i });
        }
        // System.out.println(Arrays.toString(ps));
        int ans = 0;
        for (int i = 0; i < n; i++) {
            ans = Math.max(ans, (ns[i] - ps[i] - 1) * a[i]);
        }
        return ans;
    }

    public int maximalRectangle(char[][] mat) {
        int r = mat.length;
        int c = mat[0].length;
        int ans=0;
        int[][] a = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                
                a[i][j] = (mat[i][j] == '1') ? (i == 0 ? 1 : a[i-1][j] + 1) : 0;
                // if(j == 0 || i == 0){
                //     ans=Math.max(ans,a[i][j]);
                // }
                // a[i][j] = (mat[i][j] == '1') ? (i == 0 ? 0 : a[i-1][j] + 1) : 0;
            }
        }
        
        for(int i[]:a){
            ans=Math.max(ans,his(i));
        }
        // System.out.println(Arrays.deepToString(a));
        return ans;
    }
}