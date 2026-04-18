package org.practice_DSA.recursion;
import java.util.*;

public class subset1 {
        public static void call(int idx,ArrayList<Integer> ans,int[] arr,int sum,int target){
            if(idx==arr.length){
                if(sum==target){
                    System.out.println(ans);
                }
                return;
            }

            ans.add(arr[idx]);
            //target+=arr[idx];
            call(idx+1,ans,arr,sum,target+arr[idx]);
            ans.remove(ans.size()-1);
            //target-=arr[idx];
            call(idx+1,ans,arr,sum,target);
        }
        public static void main(String[] args) {
            int[] arr={1,2,1};
            int sum=2;
            ArrayList<Integer> ans=new ArrayList<>();
            call(0,ans,arr,sum,0);
        }
}
