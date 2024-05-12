package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q79_WordSearchTest {
    @Test
    void testExample1(){
        var board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        var word = "ABCCED";

        Q79_WordSearch.Solution solution = new Q79_WordSearch.Solution();
        assertTrue(solution.exist(board, word));
    }

    @Test
    void testExample2(){
        var board = new char[][]{{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
        var word = "SEE";

        Q79_WordSearch.Solution solution = new Q79_WordSearch.Solution();
        assertTrue(solution.exist(board, word));
    }

    @Test
    void testExample3(){
        var board = new char[][]{{'A','B','C','E'}, {'S','F','E','S'}, {'A','D','E','E'}};
        var word = "ABCESEEEFS";

        Q79_WordSearch.Solution solution = new Q79_WordSearch.Solution();
        assertTrue(solution.exist(board, word));
    }
}