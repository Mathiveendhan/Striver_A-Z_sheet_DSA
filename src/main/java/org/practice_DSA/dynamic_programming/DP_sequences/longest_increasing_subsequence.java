package org.practice_DSA.dynamic_programming.DP_sequences;
import java.util.*;

public class longest_increasing_subsequence {
        public static int recursion(int[] arr, int idx, int prev) {

            if (idx == arr.length) {
                return 0;
            }
            int take = 0;
            if (prev == -1 || arr[idx] > arr[prev]) {
                take = 1 + recursion(arr, idx + 1, idx);
            }
            int notTake = recursion(arr, idx + 1, prev);

            return Math.max(take, notTake);
        }
        public static int memoization(int[] arr, int idx, int prev, int[][] dp) {

            if (idx == arr.length) {
                return 0;
            }
            if (dp[idx][prev + 1] != -1) {
                return dp[idx][prev + 1];
            }
            int take = 0;
            if (prev == -1 || arr[idx] > arr[prev]) {
                take = 1 + memoization(arr, idx + 1, idx, dp);
            }
            int notTake = memoization(arr, idx + 1, prev, dp);
            dp[idx][prev + 1] = Math.max(take, notTake);
            return dp[idx][prev + 1];
        }

        public static void main(String[] args) {

            int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

            System.out.println(recursion(arr, 0, -1));

            int[][] dp = new int[arr.length][arr.length + 1];
            for (int[] row : dp) {
                Arrays.fill(row, -1);
            }
            System.out.println(memoization(arr, 0, -1, dp));
        }
}
