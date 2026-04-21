package org.practice_DSA.graph;

public class numberOf_Islands {
    public static void DFS(int r,int c,int[][] isConnected,int[][] vis){
            vis[r][c]=1;
            int[] dr = {1,0,0,-1};
            int[] dc = {0,-1,1,0};
            for(int j=0;j<dr.length;j++){
                int row=r+dr[j];
                int col=c+dc[j];
                if(row>=0 && col>=0 && row<isConnected.length && col<isConnected[0].length && isConnected[row][col]==1 && vis[row][col]==0){
                    DFS(row, col, isConnected, vis);
                }
            }

        }
        public static void main(String[] args) {
            // int[][] grid = {
            //     {1, 1, 0, 0, 0},
            //     {1, 1, 0, 0, 0},
            //     {0, 0, 1, 0, 0},
            //     {0, 0, 0, 1, 1}
             // };
            int[][] grid = {
                    {1, 0, 0, 1},
                    {0, 1, 0, 0},
                    {1, 0, 1, 1},
                    {0, 0, 0, 1}
            };



            int[][] vis=new int[grid.length][grid[0].length];
            int count=0;

            for(int i=0;i<grid.length;i++){
                for(int j=0;j<grid[0].length;j++){
                    if(grid[i][j]==1 && vis[i][j]==0){
                        count++;
                        DFS(i,j, grid, vis);
                    }
                }
            }

            System.out.println(count);

        }
}
