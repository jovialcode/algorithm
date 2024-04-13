package com.jovial.question.leetcode;

import com.jovial.common.QuestionCategory;
import com.jovial.common.annotation.Category;
import com.jovial.common.annotation.Explanation;

@Category(QuestionCategory.BRUTAL_FORCE)
@Explanation(value = "뭔가 오늘은 최적화보단 풀기에 집중한듯..")
public class Q134_GasStation {
    public static class Solution {
        public int canCompleteCircuit(int[] gas, int[] cost) {
            final int MAX_LENGTH = gas.length;
            
            // energy gap
            int[] energy = new int[MAX_LENGTH];
            for (int i = 0; i < MAX_LENGTH; i++) {
                energy[i] = gas[i] - cost[i];
            }
            
            // find start position
            int ans = -1;

            for (int i = 0; i < MAX_LENGTH; i++) {
                int sum = energy[i];
                if(sum < 1) continue;

                int pos = i + 1;
                int temp = MAX_LENGTH;
                while(temp-- > 0){
                    if (pos == MAX_LENGTH) pos = 0;
                    if (pos == i) break;
                    if (sum < 0) break;
                    sum += energy[pos];
                    pos++;
                }

                if(sum >= 0) {
                    ans = i;
                }
            }

            if(MAX_LENGTH == 1 && energy[0] >= 0){
                return 0;
            }
            return ans;
        }
    }
}
