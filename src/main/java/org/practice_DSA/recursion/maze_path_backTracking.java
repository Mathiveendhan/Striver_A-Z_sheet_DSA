package org.practice_DSA.recursion;

public class maze_path_backTracking {
        public static void call(int[][] maze,int r,int c,String ans,int[] row,int[] col,boolean[][] vis,String position){
            if(r==maze.length-1 && c==maze.length-1){
                System.out.println(ans);
                return;
            }

            for(int i=0;i<row.length;i++){
                int rows=r+row[i];
                int cols=c+col[i];
                if(rows>=0 && cols>=0 && rows<maze.length && cols<maze[0].length && maze[rows][cols]==1 && !vis[rows][cols]){
                    //ans=ans+position.charAt(i);
                    vis[rows][cols]=true;
                    call(maze,rows,cols,ans+position.charAt(i),row,col,vis,position);
                    vis[rows][cols]=false;
                }
            }


        }
        public static void main(String[] args) {
            int[][] maze = {
                    {1, 0, 0, 0},
                    {1, 1, 0, 1},
                    {0, 1, 1, 1},
                    {0, 0, 1, 1}
            };
            boolean[][] vis=new boolean[maze.length][maze[0].length];
            int[] r={1,0,0,-1};
            int[] c={0,-1,1,0};

            //vis[0][0]=true;
            call(maze,0,0,"",r,c,vis,"DLRU");
        }

}
