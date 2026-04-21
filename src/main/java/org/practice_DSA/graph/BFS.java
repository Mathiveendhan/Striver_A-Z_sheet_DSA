package org.practice_DSA.graph;
import java.util.*;

public class BFS {
    public static void BFS( ArrayList<ArrayList<Integer>> adj,int n){
        Queue<Integer> q=new LinkedList<>();
        int[] vis=new int[n];
        q.add(0);
        vis[0]=1;

        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int size=q.size();
            int num=q.poll();
            ans.add(num);
            // System.out.println(num);

            for(int i:adj.get(num)){
                if(vis[i]==0){
                    vis[i]=1;
                    q.add(i);
                }
            }
        }
        System.out.println(ans);

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

        BFS(adj,n);
    }
}
