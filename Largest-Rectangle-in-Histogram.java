class Solution {
    public int largestRectangleArea(int[] h) {
        int len = h.length;
        int ns[]=new int[len];
        int ps[]=new int[len];
        Stack<int[]>st= new Stack<>();
        for(int i=len-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()[0] >= h[i]){
                st.pop();
            }
            ns[i] = (st.empty())?len:st.peek()[1];
            st.push(new int[]{h[i],i});
        }
        // System.out.println(Arrays.toString(ns));
        st.clear();
        for(int i=0;i<len;i++){
            while(!st.isEmpty() && st.peek()[0] >= h[i]){
                st.pop();
            }
            ps[i] = (st.empty())?-1:st.peek()[1];
            st.push(new int[] {h[i],i});
        }
        // System.out.println(Arrays.toString(ps));
        int ans=0;
        for(int i=0;i<len;i++){
            ans = Math.max(ans,(ns[i]-ps[i]-1)*h[i]);
        }
        return ans;
    }
}