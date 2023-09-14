package com.sky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ReverseFactorialTest {

    @Test
    void isFactorial(){
        Assertions.assertEquals("5!", ReverseFactorial.reverseTheFactorial(120));
    }

    @Test
    void is6Factorial(){
        Assertions.assertEquals("3!", ReverseFactorial.reverseTheFactorial(6));
    }

    @Test
    void isNotFactorial(){
        Assertions.assertEquals("NONE", ReverseFactorial.reverseTheFactorial(150));
    }

    @Test
    void is18NotFactorial(){
        Assertions.assertEquals("NONE", ReverseFactorial.reverseTheFactorial(18));
    }

}
