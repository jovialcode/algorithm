package com.jovial.question.codeforces.round950;

import com.jovial.common.annotation.Explanation;

import java.util.*;

@Explanation("DP or prefix / suffix array")
public class GCDSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n + 2];
            for (int j = 1; j <= n; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(canRemoveOneNumber(n, arr) ? "YES" : "NO");
        }
    }

    private static boolean canRemoveOneNumber(int n, int[] arr) {
        int[][] dp = new int[n + 2][2];

        dp[1][0]=1;
        dp[2][1]=1;

        for (int i = 1; i < n; i++) {
            int x = gcd(arr[i], arr[i + 1]);

            if (dp[i][0] > 0) {
                if (x >= dp[i][0]) dp[i + 1][0] = x;
                x = gcd(arr[i], arr[i + 2]);
                if (x >= dp[i][0]) {
                    dp[i + 2][1] = x;
                }
            }

            if (dp[i][1] > 0) {
                x = gcd(arr[i], arr[i + 1]);
                if (x >= dp[i][1]) {
                    if (dp[i + 1][1] == 0) dp[i + 1][1] = x;
                    else dp[i + 1][1] = Math.min(dp[i + 1][1], x);
                }
            }

        }
        return (dp[n][0] > 0 || dp[n][1] > 0 || dp[n - 1][0] > 0);
    }

    private static int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
}
