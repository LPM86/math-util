/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.LPM.mathutil.test.core;

import com.LPM.mathutil.core.MathUtil;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

/**
 *
 * @author LÊ PHƯƠNG MAI
 */
//câu lệnh này của JUnit báo hiêuj rằng sẽ cần loop qua tập data để
//lấy cặp data input/expected nhồi vào hàm test
@RunWith(value = Parameterized.class)
public class MathUtilDDTTest {

    //hàm này ta sẽ trả về mảng 2 chiều, gồm nhiều gặp expected | input
    @Parameterized.Parameters  //JUnit sẽ ngầm chạy loop qua từng dòng
    //của mảng để lấy ra đc cặp data input|expected

    //tên hàm ko quan trọng, quan trọng là @
    public static Object[][] initData() {

        return new Integer[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {4, 24},
            {5, 120},};

    }
//giả sử loop qua từng dòng của mảng; ta vẫn cần gán từng value của cột
//vào biến tương ứng input,expected để lát hồi feed cho hàm

    @Parameterized.Parameter(value = 0) //value = 0  là map với cột data
    public int n; // biến map với value của cột 0 của mảng

    @Parameterized.Parameter(value = 1) //value = 1  là map với cột data
    public long expected; // vì giá trị trả về của hàm getF là long mà

    @Test
    public void testGetFactorialGivenRightArgumentReturnsWell() {

        Assert.assertEquals(expected, MathUtil.getFactorial(n)); // t
    }

}
