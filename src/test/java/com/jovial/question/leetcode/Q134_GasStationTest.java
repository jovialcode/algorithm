package com.jovial.question.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q134_GasStationTest {
    @Test
    void testExample_1(){
        Q134_GasStation.Solution solution = new Q134_GasStation.Solution();
        int[] gas = {1,2,3,4,5};
        int[] cost = {3,4,5,1,2};
        Assertions.assertEquals(3, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void testExample_2(){
        Q134_GasStation.Solution solution = new Q134_GasStation.Solution();
        int[] gas = {2,3,4};
        int[] cost = {3,4,3};
        Assertions.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void testExample_3(){
        Q134_GasStation.Solution solution = new Q134_GasStation.Solution();
        int[] gas = {4,5,2,6,5,3};
        int[] cost = {3,2,7,3,2,9};
        Assertions.assertEquals(-1, solution.canCompleteCircuit(gas, cost));
    }

    @Test
    void testExample_4(){
        Q134_GasStation.Solution solution = new Q134_GasStation.Solution();
        int[] gas = {2};
        int[] cost = {2};
        Assertions.assertEquals(0, solution.canCompleteCircuit(gas, cost));
    }
}
