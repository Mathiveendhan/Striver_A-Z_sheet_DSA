package org.practice_DSA.dynamic_programming.DP_1D;
import java.util.*;

public class frog_jump {
    public static int space_optimization(int[] arr){
        int prev=0,prev1=0,cur=0;
        for(int idx=1;idx<arr.length;idx++){
            int l=prev+Math.abs(arr[idx]-arr[idx-1]);
            int r=Integer.MAX_VALUE;
            if(idx>1){
                r=prev1+Math.abs(arr[idx]-arr[idx-2]);
            }
            cur=Math.min(l,r);
            prev1=prev;
            prev=cur;
        }
        return cur;
    }
    public static int tabulation(int[] arr){
        int[] dp=new int[arr.length];
        int min=0;

        dp[0]=0;

        for(int idx=1;idx<arr.length;idx++){
            int l=dp[idx-1]+Math.abs(arr[idx]-arr[idx-1]);
            int r=Integer.MAX_VALUE;
            if(idx>1){
                r=dp[idx-2]+Math.abs(arr[idx]-arr[idx-2]);
            }
            min=Math.min(l,r);
            dp[idx]=min;
        }
        return min;
    }
    public static int memoization(int[] arr,HashMap<Integer,Integer> map,int idx){
        if(idx==0){
            return 0;
        }
        if(map.containsKey(idx)){
            return map.get(idx);
        }
        int l=recursion(idx-1, arr)+Math.abs(arr[idx]-arr[idx-1]);
        int r=Integer.MAX_VALUE;
        if(idx>1){
            r=recursion(idx-2, arr)+Math.abs(arr[idx]-arr[idx-2]);
        }

         int result=Math.min(r,l);
        map.put(idx,result);
        return result;
    }
        public static int recursion(int idx,int[] arr){
            if(idx==0){
                return 0;
            }
            int l=recursion(idx-1, arr)+Math.abs(arr[idx]-arr[idx-1]);
            int r=Integer.MAX_VALUE;
            if(idx>1){
                r=recursion(idx-2, arr)+Math.abs(arr[idx]-arr[idx-2]);
            }
            return Math.min(r,l);

        }
        public static void main(String[] args) {
            int[] arr={10,20,30,10};

            System.out.println(recursion(arr.length-1,arr));

            HashMap<Integer,Integer> map=new HashMap<>();
            System.out.println(memoization(arr,map,arr.length-1));

            System.out.println(tabulation(arr));

            System.out.println(space_optimization(arr));

        }
}
