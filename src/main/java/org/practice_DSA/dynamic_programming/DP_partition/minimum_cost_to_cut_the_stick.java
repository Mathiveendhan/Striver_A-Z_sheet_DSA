package org.practice_DSA.dynamic_programming.DP_partition;

import java.util.*;

public class minimum_cost_to_cut_the_stick {

    public static int recursion(int i, int j, int[] arr) {

        if (i > j) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        for (int idx = i; idx <= j; idx++) {

            int cost =
                    (arr[j + 1] - arr[i - 1])
                            + recursion(i, idx - 1, arr)
                            + recursion(idx + 1, j, arr);

            min = Math.min(min, cost);
        }

        return min;
    }

    public static int memoization(int i, int j, int[] arr, int[][] dp) {

        if (i > j) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int min = Integer.MAX_VALUE;
        for (int idx = i; idx <= j; idx++) {

            int cost =
                    (arr[j + 1] - arr[i - 1])
                            + memoization(i, idx - 1, arr, dp)
                            + memoization(idx + 1, j, arr, dp);

            min = Math.min(min, cost);
        }

        return dp[i][j] = min;
    }

    public static void main(String[] args) {

        int n = 7;
        int[] cuts = {1, 3, 4, 5};

        int c = cuts.length;

        int[] arr = new int[c + 2];
        arr[0] = 0;
        arr[c + 1] = n;

        for (int i = 0; i < c; i++) {
            arr[i + 1] = cuts[i];
        }

        Arrays.sort(arr);

        System.out.println(recursion(1, c, arr));

        int[][] dp = new int[c + 2][c + 2];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        System.out.println(memoization(1, c, arr, dp));
    }
}