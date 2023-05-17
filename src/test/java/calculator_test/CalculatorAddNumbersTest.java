package calculator_test;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static calculator.Calculator.addNumbers;
import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorAddNumbersTest {

    @ParameterizedTest
    @CsvSource({"1,2,3", "5,5,10", "100,300,400"})
    public void addNumbersSumPositiveIntegers(int number1, int number2, double result) {
        assertEquals(result, addNumbers(number1, number2),
                "Expected result " + result + ", but actual " + addNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @ParameterizedTest
    @CsvSource({"1.5,1.5,3", "10.05,8.2,18.25", "10.15,0.15,10.3"})
    public void addNumbersSumPositiveDoubles(double number1, double number2, double result) {
        assertEquals(result, addNumbers(number1, number2),
                "Expected result " + result + ", but actual " + addNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @ParameterizedTest
    @CsvSource({"1.1,1,2.1", "5,10.5,15.5", "300.100,-0.1,300"})
    public void addNumbersSumIntegerAndDouble(double number1, double number2, double result) {
        assertEquals(result, addNumbers(number1, number2),
                "Expected result " + result + ", but actual " + addNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @ParameterizedTest
    @CsvSource({"-1,-2,-3", "-5,-5,-10", "-100,-300,-400"})
    public void addNumbersSumNegativeIntegers(int number1, int number2, double result) {
        assertEquals(result, addNumbers(number1, number2),
                "Expected result " + result + ", but actual " + addNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }
}
