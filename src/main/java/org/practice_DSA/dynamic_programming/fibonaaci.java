package org.practice_DSA.dynamic_programming;
import java.util.*;
public class fibonaaci {
    public static int recursion(int n){
        if(n<2){
            return n;
        }
        return recursion(n-1)+recursion(n-2);
    }

    public static int memoization(int n, HashMap<Integer,Integer> map){
        if(n<2){
            return n;
        }

        if(map.containsKey(n)){
            return map.get(n);
        }
        int result=memoization(n-1,map)+memoization(n-2,map);
        map.put(n,result);
        return result;
    }

    public static int tabulation(int n,int[] dp){
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<n+1;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }

    public static int space_optimization(int n){
        int prev=0,prev1=1,cur=0;

        for(int i=2;i<n+1;i++){
            cur=prev+prev1;
            prev=prev1;
            prev1=cur;
        }
        return cur;
    }

    public static void main(String[] args) {
        int n=4;
        System.out.println(recursion(n));


        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println(memoization(n,map));

        int[] dp=new int[n+1];
        System.out.println(tabulation(n,dp));

        System.out.println(space_optimization(n));
    }
}
