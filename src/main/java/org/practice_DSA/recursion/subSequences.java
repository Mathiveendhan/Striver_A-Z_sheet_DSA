package org.practice_DSA.recursion;
import java.util.*;

public class subSequences {
        public static void call(int idx,int[] arr,ArrayList<Integer> ans){
            if(idx==arr.length){
                System.out.println(ans);
                return;
            }
            ans.add(arr[idx]);
            call(idx+1,arr,ans);
            ans.remove(ans.size()-1);
            call(idx+1,arr,ans);
        }
        public static void main(String[] args) {
            int[] arr={3,1,2};
            ArrayList<Integer> ans=new ArrayList<>();
            call(0,arr,ans);
        }
}
