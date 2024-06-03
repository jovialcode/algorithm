package com.jovial.question.codeforces.round950;

import java.util.*;

public class ProblemGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            scanner.nextLine();
            String questions = scanner.nextLine();
            
            System.out.println(solve(n, m, questions));
        }
    }

    public static int solve(int n, int m, String questions) {
        List<Character> list = Arrays.asList('A', 'B', 'C', 'D', 'E', 'F', 'G');
        HashMap<Character, Integer> levels = new HashMap<>();
        for (Character key : list) {
            levels.put(key, 0);
        }

        for (int i = 0; i < n; i++) {
            levels.merge(questions.charAt(i), 1, Integer::sum);
        }

        int ans = 0;
        for (Map.Entry<Character, Integer> level: levels.entrySet()) {
            if(level.getValue() < m)
                ans += (m - level.getValue());
        }
        return ans;
    }
}
