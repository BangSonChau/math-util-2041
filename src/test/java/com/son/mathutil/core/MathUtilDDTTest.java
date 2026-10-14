package com.son.mathutil.core;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilDDTTest {

    public static Object[][] initTestData() {
        //[5][2]
        return new Object[][]{{0,1}, {1,1}, {2,2}, {5,120}, {6,720}};
    }

    @ParameterizedTest
    @MethodSource("initTestData")
    void testFactorialGivenValidN0ReturnWell(int n, long expected) throws Exception {
        assertEquals(expected, MathUtil.getFactorial(n));
    }
}