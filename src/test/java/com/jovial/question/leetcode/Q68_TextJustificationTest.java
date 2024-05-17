package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Q68_TextJustificationTest {
    @Test
    void testExample(){
        var words = new String[]{"This", "is", "an", "example", "of", "text", "justification."};
        var maxWidth = 16;

        Q68_TextJustification.Solution solution = new Q68_TextJustification.Solution();
        solution.fullJustify(words, maxWidth);
    }

    @Test
    void testExample2(){
        var words = new String[]{"What","must","be","acknowledgment","shall","be"};
        var maxWidth = 16;

        Q68_TextJustification.Solution solution = new Q68_TextJustification.Solution();
        solution.fullJustify(words, maxWidth);
    }

    @Test
    void testExample3(){
        var words = new String[]{"Science","is","what","we","understand","well","enough","to","explain","to","a","computer.","Art","is","everything","else","we","do"};
        var maxWidth = 20;

        Q68_TextJustification.Solution solution = new Q68_TextJustification.Solution();
        solution.fullJustify(words, maxWidth);
    }

    @Test
    void testExample4(){
        var words = new String[]{"The","important","thing","is","not","to","stop","questioning.","Curiosity","has","its","own","reason","for","existing."};
        var maxWidth = 17;

        Q68_TextJustification.Solution solution = new Q68_TextJustification.Solution();
        solution.fullJustify(words, maxWidth);
    }
}