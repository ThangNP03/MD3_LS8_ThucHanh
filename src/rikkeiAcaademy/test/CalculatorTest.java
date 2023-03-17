package rikkeiAcaademy.test;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkeiAcaademy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
      @Test
      @DisplayName("Testing addition")
     void testCalculateAdd(){
        int a =1;
        int b = 1;
        char o = '+';
        int expected = 2;

        int result = Calculator.calculate(a, b, o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing sub")
    void testCalculateSub() {
        int a = 5;
        int b = 10;
        char o = '-';
        int expected = -5;

        int result = Calculator.calculate(a,b,o);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing multiply")
    void testCalculateMultiply() {
       int a = 10;
       int b = 5;
       char o = '*';
       int expected = 2;

       int result = Calculator.calculate(a, b, o);
       assertEquals(expected,result);
    }
}
