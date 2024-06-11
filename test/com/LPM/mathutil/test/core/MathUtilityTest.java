 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.LPM.mathutil.test.core;

/**
 *
 * @author LÊ PHƯƠNG MAI
 */
import com.LPM.mathutil.core.MathUtil;
import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author LÊ PHƯƠNG MAI
 */
public class MathUtilityTest {

    // đây là class sẽ sử dụng các hàm của thư viện/framework JUnit
    // để kiểm thử/ kiểm tra code chính - hàm tinhGiaiThu()  bên
    // class  core.MathUtil
    // viết code để test code chính bên kia!!!!
    // có quy tắc đặt tên hàm kiểm thử
    // nhưng thường sẽ là nói lên mục đích của các case/tình huống kiểm thử
    // tình huống xài hàm theo kiểu thành công và thất bại!!!
    // hàm dưới đây là tình huống test hàm chạy thành công, trả về ngon
    // ta sẽ xài hàm kiểu well - đưa 5!, 6!, hok chơi đưa -5!, 30!
    // @Test JUnit sẽ phối hợp với JVM để chạy hàm này
    // @Test phía hậu trường chính là  public static void main()
    //Có nhiều @Test ứng với nhiều case khác nhau để kiểm thử hàm tính giai thừa
    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {

        int n = 0; //test thử tình huống tử tế đầu vào, mày phải chạy đúng

        long expected = 1; //hy vọng 0! = 1

        //  long actual =  ;  //  gọi  hàm cần test bên core/app chính/code chính
        long actual = MathUtil.getFactorial(n);

        // so sánh expected vs. actual dùng xanh xanh đỏ đỏ, framework
        Assert.assertEquals(expected, actual);

        //gộp thêm vài case thành công/ đưa đầu vào ngon!!! hàm phair tính ngon 
        // làm biếng đặt tên biến 
        // 1:expected
        // MathUtil2.getFactorial(1) / 1! : actual
        Assert.assertEquals(1, MathUtil.getFactorial(1)); // tui muốn 1! == 1
        Assert.assertEquals(2, MathUtil.getFactorial(2));
        Assert.assertEquals(6, MathUtil.getFactorial(3)); // tui muốn 3! == 6
        Assert.assertEquals(24, MathUtil.getFactorial(4)); // tui muốn 4! == 24
        Assert.assertEquals(120, MathUtil.getFactorial(5)); // tui muốn 5! == 120
        Assert.assertEquals(720, MathUtil.getFactorial(6)); // tui muốn 6! == 720

        //hàm giúp so sánh 2 giá trị nào đó có giống nhau hay không
        // nếu giống nhau -> thảy màu xanh đen đường - đường thông, code ngon
        //                   ít nhất cho case đnag test
        // nếu KO GIỐNG NHAU -> thảy màu đỏ đèn đường
    } //                       hàm ý expected và actual ko giống nhau

    // hàm getF() ta thiết kế là có 2 tình huống xử lý
    //1. đưa data tử tế từ 0...20 --> tính đúng n! - done
    //2. đưa data vào cà chớn, âm, > 20; THIẾT  KẾ CỦA MÌNH LÀ NÉM RA NGOẠI LỆ
    // TAO KÌ VỌNG NGOẠI LỆ XUẤT HIỆN KHI N < 0 || N > 20
    // rất mong ngoại lệ xuất hiện với n cà chớn này
    //nếu hàm nhận vào n < 0 || n > 20 và hàm ném ra ngoại lệ
    // HÀM CHẠY ĐÚNG NHƯ THIẾT KẾ -> XANH PHẢI XUẤT HIỆN 
    // nếu hàm nhận vào n < 0 hoặc n > 20 và hàm éo ném ra ngoại lạ 
    // sure, Hàm chạy sai thiết kế, sai kì vọng, MÀU ĐỎ
    //Test case:
    //input: -5
    //expected: IllegalAgumentExpection xuất hiện
    // tình huống bất thường, ngoại lệ, ngoài dự tính, dự liệu
    // là những thứ k thể đo lường so sánh theo kiểu value
    // mà chỉ có thể đo lường bằng cách chúng có xuất hiênj hay không
    // Exception chỉ so sánh đc bằng có xuất hiện hay ko!!!!
    // assertEquals()  ko dùng để so sáng 2 ngoại lệ
    //     equals() là bằng nhau hay ko trên value!!!!
    // MÀU ĐỎ ĐÓ EM, DO HÀM ĐÚNG LÀ CÓ NÉM NGOẠI LỆ THẬT SỰ
    //                 NHƯNG KO PHẢI LÀ NGOẠI LỆ KÌ VỌNG - THỰC SỰ KÌ VỌNG SAI
    //         KO PHẢI HÀM NÉM SAI
//    @Test(expected = NumberFormatException.class)
//    public void testGetFactorialGivenWrongtArgumentReturnsThrowException() {
//        
//        MathUtil2.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
//                                    // sẽ ném về ngoại lệ NumberFormat....
//        
//    }
    // MÀU XANH, VÌ ĐÃ NÉM ĐÚNG NGOẠI LỆ KÌ VỌNG
    @Test(expected = IllegalArgumentException.class)
    public void testGetFactorialGivenWrongtArgumentReturnsThrowException() {

        MathUtil.getFactorial(-5); //hàm @Test chạy, hay hàm getF() chạy
        // sẽ ném về ngoại lệ NumberFormat....

    }

    
    
//CÁCH KHÁC ĐỂ BẮT NGOẠI LỆ XUẤT HIỆN, VIẾT TỰ NHIÊN HƠN!!!!
//xài Lambda    
//Test case: hàm sẽ ném về ngoại lệ nếu nhận vào 21  
// tui cần thấy màu xanh khi chơi với 21 giai thừa 
    @Test
    public void testGetFactorialGivenWrongtArgumentReturnsThrowException_Lambda() {

        //Assert.assertThrows(tham số 1: Loại ngoại lệ muốn so sánh, tham số 2: đoạn code chạy văng ra ngoai lệ đó )
        Assert.assertThrows(IllegalArgumentException.class,
                () -> MathUtil.getFactorial(21)
        );

          
    }
    
    
    
    //Bắt ngoại lệ, xem hàm có ném về ngoại lệ hay không khi n cà chớn
    // có ném, tức là hàm chạy đúng thiết kế -> xanh

     @Test
    public void testGetFactorialGivenWrongtArgumentReturnsThrowException_TryCatch() {

     // chủ động kiểm soát ngoại lệ   
         try {
             
             MathUtil.getFactorial(-5);
         } catch (Exception e) {
             // bắt try-catch là JUnit sẽ ra màu xanh do đã chủ động kiểm soát ngoại lệ
             // nhưng ko chắc ngoại lệ mình cần có xuất hiện hay ko
             // có đoạn code kiểm soát đúng ngoại lệ IllegalArgumentExceptin xuáta hiện
              Assert.assertEquals("Invalid argument. N must be between 0...20",e.getMessage());
         }

}
}
