package org.practice_DSA.graph;
import java.util.*;

public class DFS {
        public static void DFS(ArrayList<ArrayList<Integer>> adj,int[] vis,int n,ArrayList<Integer> ans){
            //System.out.print(n+" ");
            ans.add(n);
            vis[n]=1;
            for(int i:adj.get(n)){
                if(vis[i]==0){
                    DFS(adj,vis,i,ans);
                }
            }
        }
        public static void main(String[] args) {
            int n=5;
            ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
            for(int i=0;i<n;i++){
                adj.add(new ArrayList<>());
            }

            adj.get(0).add(1);
            adj.get(1).add(0);

            adj.get(0).add(4);
            adj.get(4).add(0);

            adj.get(1).add(2);
            adj.get(2).add(1);

            adj.get(1).add(3);
            adj.get(3).add(1);

            adj.get(1).add(4);
            adj.get(4).add(1);

            adj.get(2).add(3);
            adj.get(3).add(2);

            adj.get(3).add(4);
            adj.get(4).add(3);


            int[] vis=new int[n];
            ArrayList<Integer> ans=new ArrayList<>();
            DFS(adj,vis,0,ans);
            System.out.println(ans);
        }
}
