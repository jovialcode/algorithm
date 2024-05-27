package com.jovial.question.codeforces.round946;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PhoneDesktopTest {
    @Test
    void testExample(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(1, phoneDesktop.solve(1,1));
    }

    @Test
    void testExample2(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(1, phoneDesktop.solve(7,2));
    }

    @Test
    void testExample3(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(2, phoneDesktop.solve(12,4));
    }

    @Test
    void testExample4(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(5, phoneDesktop.solve(0,9));
    }

    @Test
    void testExample5(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(2, phoneDesktop.solve(8,2));
    }

    @Test
    void testExample6(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(1, phoneDesktop.solve(15,0));
    }


    @Test
    void testExample7(){
        PhoneDesktop phoneDesktop = new PhoneDesktop();
        assertEquals(1, phoneDesktop.solve(8,1));
    }

}