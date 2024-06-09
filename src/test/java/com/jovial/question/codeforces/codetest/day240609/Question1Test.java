package com.jovial.question.codeforces.codetest.day240609;

import com.jovial.question.codetest.day240609.Question1;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Question1Test {
    @Test
    void testExample(){
        var n = 5;
        var types = new String[]{
            "atype absbb",
            "myint aaaaa"
        };
        var codes = new String[]{
            "declare atype param 75178",
            "declare atype param 19499",
            "declare atype abc 11499",
            "declare myint abc 12345",
            "print param",
            "update param 36399",
            "print param",
            "update param abc",
            "print param",
            "update abc 49356",
            "update param abc"
        };

        Question1 question1 = new Question1();
        question1.solution(n, types, codes);
    }

    @Test
    void testExample2(){
        var n = 3;
        var types = new String[]{
            "ta aaa",
            "tb aba",
            "tc saa"
        };
        var codes = new String[]{
            "declare tt a 123",
            "declare ta a 123",
            "update a a",
            "declare tc b 479",
            "update a tb",
            "declare ta abc 789",
            "declare tb c 689",
            "update b abc",
            "update c abc",
            "print b",
            "print c",
        };

        Question1 question1 = new Question1();
        question1.solution(n, types, codes);
    }

    @Test
    void testExample3(){
        var n = 7;
        var types = new String[]{
            "typ baaaaas",
            "d aaaaaaa"
        };
        var codes = new String[]{
            "declare typ abc 8851384",
            "declare typ bbb 3374923",
            "declare type ccc 9347891",
            "declare typ d 3749283",
            "print bbb",
            "update abc bbb",
            "print typ",
        };

        Question1 question1 = new Question1();
        question1.solution(n, types, codes);
    }

    @Test
    void testExample4(){
        var n = 5;
        var types = new String[]{
            "atype absbb",
            "myint aaaaa"
        };
        var codes = new String[]{
            "declare atype param 75178",
            "declare atype param 19499",
            "declare atype abc 11499",
            "declare myint abc 12345",
            "print param",
            "update param 36399",
            "print param",
            "update param abc",
            "print param",
            "update abc 49356",
            "update param abc"
        };

        Question1 question1 = new Question1();
        question1.solution(n, types, codes);
    }

}