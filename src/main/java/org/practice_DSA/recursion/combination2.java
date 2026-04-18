package org.practice_DSA.recursion;
import java.util.*;

public class combination2 {
        public static void call(int idx,int[] arr,ArrayList<Integer> ans,int target){
            if(target==0){
                System.out.println(ans);
                return;
            }

            for(int i=idx;i<arr.length;i++){

                if(i>idx && arr[i]==arr[i-1]) continue;
                if(arr[i]>target) break;

                ans.add(arr[i]);
                call(i+1,arr,ans,target-arr[i]);
                ans.remove(ans.size()-1);
            }
        }
        public static void main(String[] args) {
            int[] arr={1,1,1,2,2};
            int target=4;
            Arrays.sort(arr);
            ArrayList<Integer> ans=new ArrayList<>();
            call(0,arr,ans,target);
        }
}


//
//import java.util.*;
//public class Main{
//    public static void call(int idx,int[] arr,int target,int sum,ArrayList<Integer> ans,HashSet<ArrayList<Integer>> set){
//        if(idx==arr.length){
//            if(target==sum){
//                //System.out.println(ans);
//                set.add(new ArrayList<>(ans));
//            }
//            return;
//        }
//        if(sum<=target){
//            ans.add(arr[idx]);
//            call(idx+1,arr,target,sum+arr[idx],ans,set);
//            ans.remove(ans.size()-1);
//        }
//        call(idx+1,arr,target,sum,ans,set);
//
//    }
//    public static void main(String[] args) {
//        int[] arr={1,1,1,2,2};
//        int target=4;
//        ArrayList<Integer> ans=new ArrayList<>();
//        HashSet<ArrayList<Integer>> set=new HashSet<>();
//        call(0,arr,target,0,ans,set);
//        for(ArrayList<Integer> a:set){
//            System.out.println(a);
//        }
//    }
//}
