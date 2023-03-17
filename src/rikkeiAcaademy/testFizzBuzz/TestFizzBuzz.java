package rikkeiAcaademy.testFizzBuzz;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkeiAcaademy.Fizzbuzz;

public class TestFizzBuzz {
    @Test
    @DisplayName("Testing fizzBuzz3")
    void testFizz3(){
        int number = 3;
        String expected = "Fizz";

        String result = Fizzbuzz.fizzBuzz(number);
        assert result.equals(expected);
    }
    @Test
    @DisplayName("Testing fizzBuzz5")
        void testFizz5() {
            int number = 5;
            String expected = "Buzz";

            String result = Fizzbuzz.fizzBuzz(number);
            assert result.equals(expected);
        }
    @Test
    @DisplayName("Testing fizzbuzz3and5")
    void fizzbuzz3and5() {
        int number = 15;
        String expected = "FizzBuzz";

        String result = Fizzbuzz.fizzBuzz(number);
        assert result.equals(expected);

    }

}
