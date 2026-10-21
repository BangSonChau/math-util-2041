package com.son.mathutil.core;

public class MathUtil {
    public static long getFactorial(int n) {

//        //thuật toán tính n! = 1.2.3......n n từ 0 đến 20
//        if (n < 0 || n > 20) {
//            throw new IllegalArgumentException("Invalid param n must be betweeb 0 and 20: " + n);
//        }
//        if (n == 0) {
//            return 1; //n= 0 return ngay
//        }
//        //sure n từ 1 đến 20
//        long result = 1; //code cố tih tạo bug: giai thừa đc nhân thêm 10
//        for (int i = 1; i <= n ; i++) {
//            result *= i;
//        }//sửa lại src tham số 1 để mlem trở lại, green 4 ever
//        return result;

        //REFACTORING, REFACTOR: TỐI ƯU, TINH CHỈNH SOURCE CODE
        //CODE MỚI KHI ĐC ĐƯA LÊN SERVER PHẢI ĐC CHECK LẠI NGAY KHI ĐƯA VÀO NHÁNH ĐEV, HOẶC KHI ĐƯ VÀO NHÁNH MAIN THÌ CŨNG PHẢI C CHECK ĐỂ ĐẢM BẢO RẰNG NÓ MÀU XANH, PASSED CÁC TEST CASE
        //LÝ DO: HÀM THÌ PHẢI CHẠY ĐÚNG
        //NẾU PROJECT CÓ SẴN TDD, UNIT TEST, THÌ QUÁ TRÌNH KIỂM THỬ LẠI CODE VỪA SỬA DIỄN RA RẤT MẠNH, RẤT TIỆN DO UNIT TEST KHI PHỐI HỢP VỚI CI SCRIPT (.YAML) SẼ TỰ ĐỘNG ĐC RUN VÀ TỰ BÁO MÀU XANH ĐỎ VÀ GỬI EMAIL CHỬI NÓ ĐỎ

        //TEST LẠI THỨ ĐÃ TỪNG TEST ĐỂ CHẮC CHẮN RNÀGƯ NÓ VẪN CÒN ỔN SAU KHI ĐC SỬA ĐC GỌI LÀ KIỂM THỬ HỒI QUY - REGRESSION TESTING

        //TA CHỈNH CODE ĐỆ QUY - RECURSION
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid param n must be betweeb 0 and 20: " + n);
        }
        if (n == 0 || n == 1) {
            return 1; //n= 0 return ngay
        }
        return getFactorial(n -1) * n;

    }
}
