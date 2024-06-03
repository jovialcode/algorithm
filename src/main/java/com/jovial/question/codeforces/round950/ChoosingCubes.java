package com.jovial.question.codeforces.round950;

import java.util.*;

public class ChoosingCubes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int f = scanner.nextInt();
            int k = scanner.nextInt();

            List<Integer> cubes = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                cubes.add(scanner.nextInt());
            }

            System.out.println(solve(cubes, n, f - 1, k - 1));
        }
    }

    public static String solve(List<Integer> cubes, int n, int f, int k) {
        Integer favoriteNum = cubes.get(f);

        cubes.sort(Comparator.reverseOrder());

        int start = 0;
        for (; start < cubes.size(); start++) {
            Integer value = cubes.get(start);
            if (Objects.equals(value, favoriteNum)) break;
        }

        int end = cubes.size() - 1;
        for (; end >= 0; end--) {
            Integer value = cubes.get(end);
            if (Objects.equals(value, favoriteNum)) break;
        }

        if (k < start) return "NO";
        else if (end <= k) return "YES";
        else return "MAYBE";
    }
}
