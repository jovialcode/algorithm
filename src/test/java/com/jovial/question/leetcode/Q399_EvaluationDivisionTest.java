package com.jovial.question.leetcode;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Q399_EvaluationDivisionTest {
    @Test
    void testExample_1(){
        var equations = List.of(List.of("a","b"), List.of("b","c"));
        var values = new double[]{2.0, 3.0};
        var queries = List.of(List.of("a","c"), List.of("b","a"), List.of("a","e"), List.of("a","a"), List.of("x","x"));

        Q399_EvaluationDivision.Solution solution = new Q399_EvaluationDivision.Solution();
        double[] doubles = solution.calcEquation(equations, values, queries);
        System.out.println(doubles);
    }

    @Test
    void testExample_2(){
        var equations = List.of(List.of("a","b"), List.of("b","c"), List.of("bc","cd"));
        var values = new double[]{1.5, 2.5, 5.0};
        var queries = List.of(List.of("a","c"), List.of("c","b"), List.of("bc","cd"), List.of("cd","bc"));

        Q399_EvaluationDivision.Solution solution = new Q399_EvaluationDivision.Solution();
        double[] doubles = solution.calcEquation(equations, values, queries);
        System.out.println(doubles);
    }

    @Test
    void testExample_3(){
        var equations = List.of(List.of("a","b"));
        var values = new double[]{0.5};
        var queries = List.of(List.of("a","b"), List.of("b","a"), List.of("a","c"), List.of("x","y"));

        Q399_EvaluationDivision.Solution solution = new Q399_EvaluationDivision.Solution();
        double[] doubles = solution.calcEquation(equations, values, queries);
        System.out.println(doubles);
    }

    @Test
    void testExample_4(){
        var equations = List.of(List.of("a","b"), List.of("c","d"));
        var values = new double[]{1.0, 1.0};
        var queries = List.of(List.of("a","c"), List.of("b","d"), List.of("b","a"), List.of("d","c"));

        Q399_EvaluationDivision.Solution solution = new Q399_EvaluationDivision.Solution();
        double[] doubles = solution.calcEquation(equations, values, queries);
        System.out.println(doubles);
    }

    @Test
    void testExample_5(){
        var equations = List.of(List.of("b","a"),List.of("c","b"),List.of("d","c"),List.of("e","d"),List.of("f","e"),List.of("g","f"),List.of("h","g"),List.of("i","h"),List.of("j","i"),List.of("k","j"),List.of("k","l"),List.of("l","m"),List.of("m","n"),List.of("n","o"),List.of("o","p"),List.of("p","q"),List.of("q","r"),List.of("r","s"),List.of("s","t"),List.of("t","u"));
        var values = new double[]{1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05,1e-05};
        var queries = List.of(List.of("a","u"));

        Q399_EvaluationDivision.Solution solution = new Q399_EvaluationDivision.Solution();
        double[] doubles = solution.calcEquation(equations, values, queries);
        System.out.println(doubles);
    }
}