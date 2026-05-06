package org.practice_DSA.dynamic_programming.DP_on_Strings;
import java.util.*;
public class longest_common_subsequence {

    public static int spaceOptimization(String a, String b) {
        int n = a.length();
        int m = b.length();

        int[] prev = new int[m + 1];
        for (int i = 1; i <= n; i++) {
            int[] curr = new int[m + 1];

            for (int j = 1; j <= m; j++) {
                if (a.charAt(i - 1) == b.charAt(j - 1)) {
                    curr[j] = 1 + prev[j - 1];
                } else {
                    curr[j] = Math.max(prev[j], curr[j - 1]);
                }
            }

            prev = curr;
        }

        return prev[m];
    }

    public static int tabulation(String a, String b) {
    int n = a.length();
    int m = b.length();

    int[][] dp = new int[n + 1][m + 1];

    for (int i = 1; i <= n; i++) {
        for (int j = 1; j <= m; j++) {
            if (a.charAt(i - 1) == b.charAt(j - 1)) {
                dp[i][j] = 1 + dp[i - 1][j - 1];
            } else {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }
    }

    return dp[n][m];
}

    public static int memoization(int i,int j,String a,String b,int[][] dp){
        if(i<0 || j<0) return 0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(a.charAt(i)==b.charAt(j)) {
            return dp[i][j]= 1 + memoization(i - 1, j - 1, a, b, dp);  //same character +1
        }
         return dp[i][j]=Math.max(memoization(i-1,j,a,b,dp),memoization(i,j-1,a,b,dp));
    }

    public static int recursion(int i,int j,String a,String b){
        if(i<0 || j<0) return 0;
        if(a.charAt(i)==b.charAt(j)){
            return 1+recursion(i-1,j-1,a,b);  //same character +1
        }
        //return 0+Math.max(recursion(i-1,j,a,b),recursion(i,j-1,a,b)); //different character +0
        return Math.max(recursion(i-1,j,a,b),recursion(i,j-1,a,b));
    }
    public static void main(String[] args) {
        String a="abcde",b="ace";
        int n=a.length(),m=b.length();

        System.out.println(recursion(n-1,m-1,"abcde","ace"));

        int[][] dp=new int[n][m];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(memoization(n-1,m-1,a,b,dp));

        System.out.println(tabulation(a, b));

        System.out.println(spaceOptimization(a, b));
    }
}
