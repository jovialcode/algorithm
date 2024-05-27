package com.jovial.question.codeforces.round946;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneDesktop {
    public void input() {
        Scanner scanner = new Scanner(System.in);

        int numOfEntries = scanner.nextInt();

        List<int[]> data = new ArrayList<>();

        for (int i = 0; i < numOfEntries; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            data.add(new int[]{x, y});
        }

        for (int[] entry : data) {
            System.out.println(solve(entry[0], entry[1]));
        }
    }

    public int solve(int x, int y) {
        int ans = 0;

        while (x > 0 || y > 0) {
            if (y >= 2) {
                y -= 2;
                if (x > 0)
                    x -= 7;
            } else if(y == 1){
                y -= 1;
                x -= 11;
            }else{
                x -= 15;
            }
            ans += 1;
        }

        return ans;
    }
}
