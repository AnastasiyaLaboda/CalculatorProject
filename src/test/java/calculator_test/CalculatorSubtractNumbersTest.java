package calculator_test;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static calculator.Calculator.subtractNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorSubtractNumbersTest {

    @ParameterizedTest
    @CsvSource({"2,1,1", "15,5,10", "400,300,100"})
    public void subtractNumbersPositiveIntegers(int number1, int number2, double result) {
        assertEquals(result, subtractNumbers(number1, number2),
                "Expected result " + result + ", but actual " + subtractNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @ParameterizedTest
    @CsvSource({"1.5,1.5,0", "10.23,8.23,2.0", "10.15,0.15,10.0"})
    public void subtractNumbersPositiveDoubles(double number1, double number2, double result) {
        assertEquals(result, subtractNumbers(number1, number2),
                "Expected result " + result + ", but actual " + subtractNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @ParameterizedTest
    @CsvSource({"1,-0.1,1.1", "25,10.5,14.5", "300,0.1,299.9"})
    public void subtractNumbersIntegerAndDouble(int number1, double number2, double result) {
        assertEquals(result, subtractNumbers(number1, number2),
                "Expected result " + result + ", but actual " + subtractNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @ParameterizedTest
    @CsvSource({"-1,-2,1", "-5,-5,0", "-300,-100,-200"})
    public void subtractNumbersNegativeIntegers(int number1, int number2, double result) {
        assertEquals(result, subtractNumbers(number1, number2),
                "Expected result " + result + ", but actual " + subtractNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

}
