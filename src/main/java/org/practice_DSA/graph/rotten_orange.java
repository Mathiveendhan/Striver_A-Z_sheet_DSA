package org.practice_DSA.graph;
import java.util.*;

public class rotten_orange {
        static class pair{
            int r;
            int c;
            public pair(int r,int c){
                this.r=r;
                this.c=c;
            }
        }
        public static void main(String[] args) {
            int[][] grid = {
                    {2,1,1},
                    {1,1,0},
                    {0,1,1}
            };

            int n=grid.length;
            int m=grid[0].length;
            int[][] vis=new int[n][m];
            int countFresh=0;

            Queue<pair> q=new LinkedList<>();
            int count=0;

            for(int a=0;a<grid.length;a++){
                for(int b=0;b<grid[0].length;b++){
                    if(grid[a][b]==2){
                        vis[a][b]=2;
                        q.add(new pair(a,b));
                    }else if(grid[a][b]==1){
                        vis[a][b]=1;
                        countFresh++;

                    }else{
                        vis[a][b]=0;
                    }
                }
            }
            int time=0;

            int[] dr={1,0,0,-1};
            int[] dc={0,-1,1,0};

            while(!q.isEmpty()){
                int size=q.size();
                boolean rotten=false;

                for(int i=0;i<size;i++){
                    int r=q.peek().r;
                    int c=q.peek().c;
                    q.poll();
                    for(int j=0;j<dr.length;j++){
                        int row=r+dr[j];
                        int col=c+dc[j];
                        if(row>=0 && col>=0 && row<n && col<m && grid[row][col]==1 && vis[row][col]==1){
                            q.add(new pair(row,col));
                            vis[row][col]=2;
                            grid[row][col]=2;
                            count++;
                            rotten=true;
                        }
                    }
                }

                //increment time++ after every level of BFS, even for the last level where no new oranges are rotted.so to avoid that i use boolean rotten to confirm rotten operation happened
                // time++; instead of this,use this line below
                if(rotten) time++;
            }
            if(count!=countFresh){
                System.out.println("-1");
            }else{
                System.out.println(time);
            }
        }
}
