package org.practice_DSA.graph;
import java.util.*;

public class cycle_detection_DFS {
        public static boolean checkCycleDFS(ArrayList<ArrayList<Integer>> adj,int node,int parent,int[] vis){
            vis[node]=1;
            for(int i:adj.get(node)){
                if(vis[i]==0){
                    if(checkCycleDFS(adj,i,node,vis)==true){
                        return true;
                    }
                }else if(i!=parent){
                    return true;
                }
            }

            return false;
        }
        public static void main(String[] args) {
            int n=7;
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int q=0;q<=n;q++){
                adj.add(new ArrayList<>());
            }

            adj.get(1).addAll(Arrays.asList(2, 3));
            adj.get(2).addAll(Arrays.asList(1, 5));
            adj.get(3).addAll(Arrays.asList(1, 4, 6));
            adj.get(4).add(3);
            adj.get(5).addAll(Arrays.asList(2, 7));
            adj.get(6).addAll(Arrays.asList(3, 7));
            adj.get(7).addAll(Arrays.asList(5, 6));


            int[] vis=new int[n+1];
            System.out.println(checkCycleDFS(adj,1,-1,vis));
        }
}
