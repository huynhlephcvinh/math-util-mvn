/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.vinhhuynh.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ACER-PC
 */
public class MathUtilityTest {
   //TEST CASE TEMPLATE/STRUCTURE
    // id | desc | steps/procedures | expected result | status(passed/failed)
    
    //Test case #1: Verify the getFactorial() function with n = 0
    //Steps/Procedures:
    //                   1. Given n =0
   //                    2. Call/invoke getFactorial(int n)
   //Expected Result
    //                The method getFactorial(n=0) must return 1
    //                               as the result of 0! == 1
   //Status:   PASSED | FAILED
@Test
public void verifyFactorialGivenRightArgument0ReturnOk(){
    assertEquals(1,MathUtility.getFactorial(0));
}


//TEST CASE #2....n=1
@Test
public void verifyFactorialGivenRightArgument1ReturnOk(){
    assertEquals(1,MathUtility.getFactorial(1));
}

//TEST CASE #3....n=6
@Test
public void verifyFactorialGivenRightArgument6ReturnOk(){
    assertEquals(720,MathUtility.getFactorial(6));
}
    
}
