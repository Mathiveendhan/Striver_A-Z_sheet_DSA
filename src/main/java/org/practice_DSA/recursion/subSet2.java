package org.practice_DSA.recursion;
import java.util.*;

public class subSet2 {
        public static void call(int idx,int[] arr, ArrayList<Integer> ans){
            //ds.add(new ArrayList<>(ans));
            System.out.println(ans);

            for(int i=idx;i<arr.length;i++){

                if(i>idx && arr[i]==arr[i-1]) continue;

                ans.add(arr[i]);
                call(i+1,arr,ans);
                ans.remove(ans.size()-1);
            }
        }
        public static void main(String[] args) {
            int[] arr={1,2,2,3,3};
            Arrays.sort(arr);

            ArrayList<Integer> ans=new ArrayList<>();
            call(0,arr,ans);

        }
}
