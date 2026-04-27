package org.practice_DSA.dynamic_programming.DP_1D;
import java.util.*;

public class house_robber {
    public static int spaceOptimizedForward(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int prev2 = nums[0];
        int prev = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int curr = Math.max(prev, nums[i] + prev2);
            prev2 = prev;
            prev = curr;
        }

        return prev;
    }
    public static int tabulationForward(int[] nums) {
        int n = nums.length;

        if (n == 0) return 0;
        if (n == 1) return nums[0];

        int[] dp = new int[n];

        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < n; i++) {
            int rob = nums[i] + dp[i - 2];
            int skip = dp[i - 1];
            dp[i] = Math.max(rob, skip);
        }

        return dp[n - 1];
    }
    public static int memoization(HashMap<Integer,Integer> map,int[] nums,int i){
        if(i>=nums.length) return 0;

        if(map.containsKey(i)) return map.get(i);

        int l=nums[i]+memoization(map,nums,i+2);
        int r=0+memoization(map,nums,i+1);

        map.put(i,Math.max(l,r));
        return Math.max(l,r);
    }
    public static int recursion(int[] nums,int i){
             if(i>=nums.length) return 0;
             int l=nums[i]+recursion(nums,i+2);
             int r=0+recursion(nums,i+1);
             return Math.max(l,r);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        System.out.println(recursion(nums,0));


        HashMap<Integer,Integer> map=new HashMap<>();
        System.out.println(memoization(map,nums,0));
        System.out.println(tabulationForward(nums));

        System.out.println(spaceOptimizedForward(nums));
    }
}
