/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vinhhuynh.mathutil.core;

/**
 *
 * @author Acer
 */
//class này sẽ chứa các hàm static dùng để làm thư viện cho các
// nơi khác/ class khác xài
public class MathUtility {
    public static final double PI = 3.14;
    // public const double Pi = 3.14 // C ko cần static mà vẫn giống
                                     // vì có chữ const ~ final
    // hàm tính n! = 1.2.3...n
    // 0! = 1! = 1 - quy ước
    // ko tính dc giai thừa số âm
    // n! tăng rất nhanh, 20! vừa đủ full kiểu long 18 con số 0
    // vậy 21! ko chứa trong long dc, tràn kiểu dữ liệu
    // quy ước < 0 ! và > 20! ném ngoại lệ, ko tính dc
//    public static long getFactorial(int n) {
//        if (n < 0 || n > 20) 
//            throw new IllegalArgumentException("Invalid n. n must be 0..20");
//        
//        if (n == 0 || n == 1)
//            return 1; // kết thúc sớm hàm, nếu có thể
//        
//        long result = 1; // biến tích lũy, gom dồn việc nhân, biến con heo đất
//                         // acc accumlation
//        
//        // sống sót đến for, sure n = 2..20                 
//        for (int i = 2; i <= n; i++) 
//            result *= i;
//               
//        return result;
//    }
    
    
    //Dùng đê quy
    //5! =1.2.3.4   .5
    //5! =      4!*5 = 5*4!
    //4! 1.2.3   .4
    //        3! *4 = 4*3!
    //3!=3*2!
    //2! = 2*1! dừng nhen, đệ quy luôn phải dừng
    //N! = N*(N-1)!
    
        public static long getFactorial(int n) {  //n!
        if (n < 0 || n > 20) 
            throw new IllegalArgumentException("Invalid n. n must be 0..20");
        
        if (n == 0 || n == 1)
            return 1; // kết thúc sớm hàm, nếu có thể
        // Dùng đệ quy
        return n*getFactorial(n-1);
           
    }
        
        //KĨ THUẬT KIỂM THỬ GỌI LÀ: REGRESSION TESTING
        //                           KIỂM THỬ HỒI QUY  - TEST LẠI NHỮNG THỨ ĐÃ TỪNG TEST
        //Trong thực tế làm dự án, code của ta sẽ liên tục đc chỉnh sửa
        //sửa vì:
        // fix bug thì phải sửa vode, sửa hàm
        // thêm hàm, thêm tính năng
        // tối ưu hàm cũ gọn hơn dễ đọc hơn, chạy nhanh hơn
        //Hàm đang ngon - màu xanh, nếu ta sửa hàm vì lí do nào đó
}
