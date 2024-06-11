/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.LPM.mathutil.main;

import com.LPM.mathutil.core.MathUtil;

/**
 *
 * @author LÊ PHƯƠNG MAI
 */
public class Main {
    public static void main(String[] args) {
        // thử nghiệm hàm tính giai thừa coi chạy đúng như thiết kế ko
        // ta phải đưa các tình huống sử dụng hàm trong thực tế
        // vd: -5 coi tính đc k
         //    0 coi tính r mấy
         // 20 coi tính ra mấy
         // 21 coi tính ra mấy
         // TEST CASE: Một tình huống hàm/app/màn hình/tính năng đc đưa vào sử dụng
         // giả lập hành vi xài của ai đó!!!!
         
         // Test Case: là một tình huống sử dụng app, xài app (Hàm) mà nó bao gồm :
         //Input: Data đầu vào cụ thể nào đó
         // Output:  đầu ra ứng với xử lí của Hàm/App, dĩ nhiên dùng đầu vào để xử lí
         // Để xem kết quả có như kì vọng hay ko
         // Kì vọng: Mong hàm sẽ trả về value nào đó ứng vs Input ở trên
         //SO sánh để xem kết quả có như kì vọng hay ko
         
         long expected = 120; // tao kì vọng hàm ois về 120 nếu tính 5!
         
         int n = 5;  //input
         
         long actual = MathUtil.getFactorial(n); //thực tế
         
         System.out.println("5! = " + expected + " (expected) " );
         System.out.println("5! = " + actual + " (actual) " );
         
         
         
         
           
         
      
    }
}
