package com.son.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {

        //thuật toán tính n! = 1.2.3......n n từ 0 đến 20
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid param n must be betweeb 0 and 20: " + n);
        }
        if (n == 0) {
            return 1; //n= 0 return ngay
        }
        //sure n từ 1 đến 20
        long result = 1;
        for (int i = 1; i <= n ; i++) {
            result *= i;
        }
        return result;
    }
}
