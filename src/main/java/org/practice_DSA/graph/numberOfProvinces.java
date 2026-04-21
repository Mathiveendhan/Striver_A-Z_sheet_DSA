package org.practice_DSA.graph;
import java.util.*;

public class numberOfProvinces {
    public static void DFS(int idx,ArrayList<ArrayList<Integer>> adj,int[] vis){
            vis[idx]=1;
            for(int i:adj.get(idx)){
                if(vis[i]==0){
                    DFS(i,adj,vis);
                }
            }

        }
        public static void main(String[] args) {
            int[][] isConnected = {
                    {1, 1, 0},
                    {1, 1, 0},
                    {0, 0, 1}
            };
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int a=0;a<isConnected.length;a++){
                adj.add(new ArrayList<>());
            }

            for(int i=0;i<isConnected.length;i++){
                for(int j=0;j<isConnected[0].length;j++){
                    if(isConnected[i][j]==1 && i!=j){
                        adj.get(i).add(j);
                        adj.get(j).add(i);
                    }
                }
            }


            int[] vis=new int[isConnected.length];
            int count=0;

            for(int x=0;x<isConnected.length;x++){
                if(vis[x]==0){
                    count++;
                    DFS(x,adj,vis);
                }
            }

            System.out.println(count);

        }
}



/// adj matrix
//
//class Main{
//    public static void DFS(int r,int c,int[][] isConnected,int[][] vis){
//        vis[r][c]=1;
//        int[] dr = {-1, 1, 0, 0};
//        int[] dc = {0, 0, -1, 1};
//        for(int j=0;j<dr.length;j++){
//            int row=r+dr[j];
//            int col=c+dc[j];
//            if(row>=0 && col>=0 && row<isConnected.length && col<isConnected[0].length && isConnected[row][col]==1 && vis[row][col]==0){
//                DFS(row, col, isConnected, vis);
//            }
//        }
//
//    }
//    public static void main(String[] args) {
//        int[][] isConnected = {
//                {1, 1, 0},
//                {1, 1, 0},
//                {0, 0, 1}
//        };
//
//
//
//        int[][] vis=new int[isConnected.length][isConnected[0].length];
//        int count=0;
//
//        for(int i=0;i<isConnected.length;i++){
//            for(int j=0;j<isConnected[0].length;j++){
//                if(isConnected[i][j]==1 && vis[i][j]==0){
//                    count++;
//                    DFS(i,j, isConnected, vis);
//                }
//            }
//        }
//
//         for(int x=0;x<isConnected.length;x++){
//             if(vis[x]==0){
//                 count++;
//                 DFS(x,isConnected,vis);
//             }
//         }
//
//        System.out.println(count);
//
//    }
//}
