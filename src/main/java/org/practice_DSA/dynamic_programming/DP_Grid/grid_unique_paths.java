package org.practice_DSA.dynamic_programming.DP_Grid;
import java.util.*;
public class grid_unique_paths {
    public static int tabulation(int[][] arr,int i,int j,int[][] dp){
        for(int a=0;a<i;a++){
            for(int b=0;b<j;b++){
                if(a==0 && b==0){
                    dp[a][b]=1;
                    continue;
                }
                int l=0,r=0;
                if(a>0){
                    l=dp[a-1][b];
                }

                if(b>0){
                    r=dp[a][b-1];
                }
                dp[a][b]=l+r;
            }
        }
        return dp[i-1][j-1];
    }
    public static int memoization(int[][] arr,int i,int j,int[][] dp){
        if(i==0 && j==0) return 1;

        if(i<0 || j<0){
            return 0;
        }
        if(dp[i][j]!=0) return dp[i][j];

        int l=memoization(arr,i-1,j,dp);
        int r=memoization(arr,i,j-1,dp);
        dp[i][j]=l+r;
        return dp[i][j];
    }
    public static int recursion(int[][] arr,int i,int j){
        if(i==0 && j==0) return 1;

        if(i<0 || j<0){
            return 0;
        }

        int l=recursion(arr,i-1,j);
        int r=recursion(arr,i,j-1);
        return l+r;
    }
    public static void main(String[] args) {
        int[][] arr={{0,0,0,},{0,0,0,},{0,0,0,}};
        int m = arr.length;
        int n = arr[0].length;

        System.out.println(recursion(arr,m-1,n-1));

//        int[][] dp=new int[n][m];
//
//        System.out.println(memoization(arr,n-1,m-1,dp));
        int[][] dp=new int[m][n];


        System.out.println(tabulation(arr,n,m,dp));
    }
}
