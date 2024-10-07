class Solution {
    int max=0;
    public void bfs(int row,int col,int [][]grid){
        Queue<int []>q=new LinkedList<>();
        q.add(new int[]{row,col});
        grid[row][col]=0;
        int c=0;
        while(!q.isEmpty()){
            c++;
            max=Math.max(max,c);
            int r[]=q.poll();
            int v1[]=new int[]{-1,0,1,0};
            int v2[]=new int[]{0,-1,0,1};
            for(int k=0;k<4;k++){
                int x=r[0]+v1[k];
                int y=r[1]+v2[k];
                if(x>=0 && x<grid.length && y>=0 && y<grid[0].length && grid[x][y] == 1){
                    q.add(new int[]{x,y});
                    grid[x][y]=0;
                }
            }
        }
        
    }
    public int maxAreaOfIsland(int[][] grid) {
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1){
                    bfs(i,j,grid);
                }
            }
        }
        return max;
    }
}