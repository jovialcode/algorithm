package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q322_CoinChangeTest {
    @Test
    void testExample1(){
        var coins = new int[]{1,2,5};
        var amount = 11;
        Q322_CoinChange.Solution solution = new Q322_CoinChange.Solution();
        assertEquals(3, solution.coinChange(coins, amount));
    }

    @Test
    void testExample2(){
        var coins = new int[]{2};
        var amount = 3;
        Q322_CoinChange.Solution solution = new Q322_CoinChange.Solution();
        assertEquals(-1, solution.coinChange(coins, amount));
    }

    @Test
    void testExample3(){
        var coins = new int[]{1};
        var amount = 0;
        Q322_CoinChange.Solution solution = new Q322_CoinChange.Solution();
        assertEquals(0, solution.coinChange(coins, amount));
    }

    @Test
    void testExample4(){
        var coins = new int[]{186,419,83,408};
        var amount = 6249;
        Q322_CoinChange.Solution solution = new Q322_CoinChange.Solution();
        assertEquals(20, solution.coinChange(coins, amount));
    }

    @Test
    void testExample5(){
        var coins = new int[]{1, 3,6,9};
        var amount = 49;
        Q322_CoinChange.Solution solution = new Q322_CoinChange.Solution();
        assertEquals(7, solution.coinChange(coins, amount));
    }
}