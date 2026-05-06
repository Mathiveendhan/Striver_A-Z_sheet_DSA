package org.practice_DSA.dynamic_programming.DP_on_Subsequences;
import java.util.*;

class subset_Sum{

    public static boolean tabulation(int[] arr, int target) {
        int n = arr.length;

        boolean[][] dp = new boolean[n + 1][target + 1];

        for (int i = 0; i <= n; i++) {
            dp[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                dp[i][j] = dp[i - 1][j];

                if (j >= arr[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        return dp[n][target];
    }

    public static boolean memoization(HashMap<String,Boolean> map,int i,int target,int[] arr,int sum){
        if(i==arr.length){
            if(sum==target){
                return true;
            }
            return false;
        }
        String key=i+"-"+sum;
        if(map.containsKey(key)){
            return map.get(key);
        }
        boolean take=memoization(map,i+1,target,arr,sum+arr[i]);
        boolean not_take=memoization(map,i+1,target,arr,sum);
        map.put(key,(take || not_take));
        return take || not_take;
    }

    public static boolean recursion(int i,int target,int[] arr,int sum){
        if(i==arr.length){
            if(sum==target){
                return true;
            }
            return false;
        }
        boolean take=recursion(i+1,target,arr,sum+arr[i]);
        boolean not_take=recursion(i+1,target,arr,sum);
        return take || not_take;
    }

    public static void main(String[] args) {
        int[] arr={2,3,1,1};
        int target=4;
        //System.out.println(recursion(0,target,arr,0));

        HashMap<String,Boolean> map=new HashMap<>();
        // System.out.println(memoization(map,0,target,arr,0));


        System.out.println(tabulation(arr,target));


    }
}
