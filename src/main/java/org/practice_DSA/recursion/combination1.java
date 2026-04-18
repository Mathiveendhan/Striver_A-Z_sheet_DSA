package org.practice_DSA.recursion;
import java.util.*;

public class combination1 {
        public static void call(int idx,int[] arr,int target,int sum,ArrayList<Integer> ans){
            if(idx==arr.length){
                if(target==sum){
                    System.out.println(ans);
                }
                return;
            }
            if(sum<=target){
                ans.add(arr[idx]);
                call(idx,arr,target,sum+arr[idx],ans);
                ans.remove(ans.size()-1);
            }
            call(idx+1,arr,target,sum,ans);

        }
        public static void main(String[] args) {
            int[] arr={2,3,6,7};
            int target=7;
            ArrayList<Integer> ans=new ArrayList<>();
            call(0,arr,target,0,ans);
        }
}
