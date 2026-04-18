package org.practice_DSA.recursion;
import java.util.*;

public class permutation {
     public static void call(int[] arr,boolean[] vis, ArrayList<Integer> ans){
            if(arr.length==ans.size()){
                System.out.println(ans);
                return;
            }

            for(int i=0;i<arr.length;i++){
                if(vis[i]==false){
                    vis[i]=true;
                    ans.add(arr[i]);
                    call(arr,vis,ans);
                    vis[i]=false;
                    ans.remove(ans.size()-1);
                }
            }
        }
        public static void main(String[] args) {
            int[] arr={1,2,3};
            ArrayList<Integer> ans=new ArrayList<>();
            boolean[] vis=new boolean[arr.length];
            call(arr,vis,ans);
        }
}
