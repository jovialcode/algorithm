package com.jovial.question.codeforces.round951;

import java.util.*;

public class GuessTheMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int j = 0; j < n; j++) {
                arr[j] = scanner.nextInt();
            }
            System.out.println(solve(arr));
        }
    }

    public static int solve(int[] arr) {
        int minValue = 1000000001;

        for (int i = 0; i < arr.length - 1; i++) {
            minValue = Math.min(minValue, Math.max(arr[i], arr[i + 1]));
        }

        return minValue - 1;
    }
}
