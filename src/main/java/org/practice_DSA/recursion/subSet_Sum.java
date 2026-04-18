package org.practice_DSA.recursion;
import java.util.*;

public class subSet_Sum {

        public static void call(int idx,int[] arr,int sum, ArrayList<Integer> ans){
            if(idx==arr.length){
                ans.add(sum);
                return;
            }
            call(idx+1,arr,sum+arr[idx],ans);
            call(idx+1,arr,sum,ans);
        }
        public static void main(String[] args) {
            int[] arr={3,1,4};
            ArrayList<Integer> ans=new ArrayList<>();
            call(0,arr,0,ans);
            Collections.sort(ans);
            for(int i:ans){
                System.out.println(i);
            }
        }
}
