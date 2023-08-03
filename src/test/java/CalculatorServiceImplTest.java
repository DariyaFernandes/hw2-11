

import com.example.hw211.TestUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {


    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    void plus_first_success() {
        int num1 = 2;
        int num2 = 2;

        String expectedResult = TestUtils.stringResult(2, 2, "4", "+" );

        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus_second_success() {
        int num1 = 0;
        int num2 = 8;

        String expectedResult = TestUtils.stringResult(0, 8, "8", "+" );

        String actualResult = calculatorService.plus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus_success() {
        int num1 = 5;
        int num2 = 3;

        String expectedResult = TestUtils.stringResult(5, 3, "2", "-" );

        String actualResult = calculatorService.minus(num1, num2);
        assertEquals(expectedResult, actualResult);
    }



    @Test
    void multiply_success() {
        int num1 = 2;
        int num2 = 3;

        String expectedResult = TestUtils.stringResult(2, 3, "6", "*" );

        String actualResult = calculatorService.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }


    @Test
    void divide_success() {
        int num1 = 6;
        int num2 = 2;

        String expectedResult = TestUtils.stringResult(6, 2, "3.0", ":" );

        String actualResult = calculatorService.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void divide_withException() {
        int num1 = 4;
        int num2 = 0;
        
        String expectedMassage = "На ноль делить нельзя!";

       
        Exception exception = assertThrows(IllegalStateException.class,
                () -> calculatorService.divide (num1, num2));
        assertEquals(expectedMassage, exception.getMessage());
    }
    }
