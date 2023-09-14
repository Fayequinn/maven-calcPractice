package com.sky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcTest {

@Test
  void testAdd2And3(){
    Assertions.assertEquals(5, Calc.add(2, 3));
}

@Test
    void testAdd5And9(){
        Assertions.assertEquals(14, Calc.add(5, 9));
    }

    @Test
    void testAddNeg3And7(){
        Assertions.assertEquals(4, Calc.add(-3, 7));
    }

    @Test
    void test10Minus6(){
    Assertions.assertEquals(4, Calc.subtract(10, 6));
    }

    @Test
    void test4Minus2(){
        Assertions.assertEquals(2, Calc.subtract(4, 2));
    }

    @Test
    void test3Minus8(){
        Assertions.assertEquals(-5, Calc.subtract(3, 8));
    }

    @Test
    void test10MultiplyBy6(){
        Assertions.assertEquals(60, Calc.multiply(10, 6));
    }

    @Test
    void test4MultiplyBy2(){
        Assertions.assertEquals(8, Calc.multiply(4, 2));
    }

    @Test
    void testNeg3MultiplyBy8(){
        Assertions.assertEquals(-24, Calc.multiply(-3, 8));
    }

    @Test
    void test10DivideBy2(){
    Assertions.assertEquals(5, Calc.divide(10, 2));
    }

    @Test
    void test30DivideBy6(){
        Assertions.assertEquals(5, Calc.divide(30, 6));
    }

    @Test
    void test20DivideByNeg5(){
        Assertions.assertEquals(-4, Calc.divide(20, -5));
    }
}
