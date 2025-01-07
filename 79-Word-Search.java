class Solution {
    public boolean DFS(String w,boolean [][]vis,int ind,int row,int col,char b[][]){
        if(row<0 || row>=b.length || col<0 || col>=b[0].length || vis[row][col] || b[row][col] != w.charAt(ind))
        return false;
        if(ind == w.length()-1) return true;
        vis[row][col]=true;

        boolean x=DFS(w,vis,ind+1,row+1,col,b);
        boolean y=DFS(w,vis,ind+1,row-1,col,b);
        boolean z=DFS(w,vis,ind+1,row,col+1,b);
        boolean q=DFS(w,vis,ind+1,row,col-1,b);
        
        vis[row][col]=false;

        return x||y||z||q;
    }
    public boolean exist(char[][] b, String w) {
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b[0].length;j++){
                if(b[i][j] == w.charAt(0)){
                    boolean vis[][]=new boolean[b.length][b[0].length];
                    if((DFS(w,vis,0,i,j,b))) return true;
                }
            }
        }
        return false;
    }
}