package com.son.mathutil.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MathUtilTest {
    //test case #1: n =5 , expected = 120
    @Test
    void testFactorialGivenValidN5ReturnWell120() {
        int n = 5;
        long expected = 120;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenValidN6ReturnWell720() {
        int n = 6;
        long expected = 720;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    @Test
    void testFactorialGivenValidN0ReturnWell1() {
        int n = 0;
        long expected = 1;
        long actual = MathUtil.getFactorial(n);
        assertEquals(expected, actual);
    }

    //testcase #4: n = -1!, expected = hàm phải ném ra ngoại lệ thì mới là hàm đúng, ví dụ kiến -1 phải ném ra ngoại lệ
    //ngoại lệ ko thể so sánh giá trị nên phải dùng cái khác
    @Test
    void testFactorialGivenInValidMinus1ThrowException() {
        int invalidN = -1;
        //assertThrows(ngoại lệ cần bắt xem có hl ko, hàm lamda có lệnh gọi hàm code chính mà gây ra lỗi);
        assertThrows(IllegalArgumentException.class, () -> MathUtil.getFactorial(invalidN));
    }
}