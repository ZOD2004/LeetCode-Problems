class Solution {
    public void bfs(int[][] mat,Queue<int[]>q){
        while(!q.isEmpty()){
            int a[]=q.poll();
            int r=a[0];
            int c=a[1];
            
        }
    }
    public void setZeroes(int[][] mat) {
        Queue<int[]>q=new LinkedList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j] == 0){
                    q.add(new int[]{i,j});
                }
            }
        }
        bfs(mat,q);
    }
}