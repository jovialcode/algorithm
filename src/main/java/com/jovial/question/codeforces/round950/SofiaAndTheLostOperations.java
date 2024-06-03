package com.jovial.question.codeforces.round950;

import java.util.HashMap;
import java.util.Scanner;

public class SofiaAndTheLostOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            scanner.nextLine();

            int[] origin = new int[n];
            for (int j = 0; j < n; j++) {
                origin[j] = scanner.nextInt();
            }
            scanner.nextLine();

            int[] result = new int[n];
            for (int j = 0; j < n; j++) {
                result[j] = scanner.nextInt();
            }
            scanner.nextLine();

            int m = scanner.nextInt();
            scanner.nextLine();

            int[] operations = new int[m];
            for (int j = 0; j < m; j++) {
                operations[j] = scanner.nextInt();
            }
            scanner.nextLine();

            System.out.println(sol(origin, result, operations) ? "YES" : "NO");
        }
    }

    private static boolean sol(int[] origin, int[] result, int[] operations) {
        // operations matching
        HashMap<Integer, Integer> unMatch = new HashMap<>();
        HashMap<Integer, Integer> match = new HashMap<>();
        for (int i = 0; i < origin.length; i++) {
            int originValue = origin[i];
            int resultValue = result[i];

            if (originValue != resultValue) {
                unMatch.merge(resultValue, 1, Integer::sum);
            } else {
                match.merge(resultValue, 1, Integer::sum);
            }
        }

        // operations sequential
        boolean remain = false;
        for (int operation : operations) {
            int value = unMatch.getOrDefault(operation, 0);
            if (value != 0) {
                unMatch.put(operation, value - 1);
                match.merge(operation, 1, Integer::sum);
                remain = false;
            } else remain = !match.containsKey(operation);
        }

        if (remain) return false;
        return unMatch.values().stream().noneMatch(value -> value != 0);
    }
}
