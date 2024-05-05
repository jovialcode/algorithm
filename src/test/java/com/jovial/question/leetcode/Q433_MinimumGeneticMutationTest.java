package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q433_MinimumGeneticMutationTest {
    @Test
    void testExample1(){
        var startGene = "AACCGGTT";
        var endGene = "AACCGGTA";
        var bank = new String[]{"AACCGGTA"};

        Q433_MinimumGeneticMutation.Solution solution = new Q433_MinimumGeneticMutation.Solution();
        assertEquals(1, solution.minMutation(startGene,endGene,bank));
    }

    @Test
    void testExample2(){
        var startGene = "AACCGGTT";
        var endGene = "AAACGGTA";
        var bank = new String[]{"AACCGGTA","AACCGCTA","AAACGGTA"};

        Q433_MinimumGeneticMutation.Solution solution = new Q433_MinimumGeneticMutation.Solution();
        assertEquals(2, solution.minMutation(startGene,endGene,bank));
    }

    @Test
    void testExample3(){
        var startGene = "AAAACCCC";
        var endGene = "CCCCCCCC";
        var bank = new String[]{"AAAACCCA","AAACCCCA","AACCCCCA","AACCCCCC","ACCCCCCC","CCCCCCCC","AAACCCCC","AACCCCCC"};

        Q433_MinimumGeneticMutation.Solution solution = new Q433_MinimumGeneticMutation.Solution();
        assertEquals(4, solution.minMutation(startGene,endGene,bank));
    }
}