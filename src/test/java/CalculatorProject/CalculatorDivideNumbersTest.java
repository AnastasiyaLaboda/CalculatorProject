package CalculatorProject;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorDivideNumbersTest {
    private static Stream<Arguments> provideNumbersForDivideNumbersTest() {
        return Stream.of(
                Arguments.of(10, 2, 5),
                Arguments.of(0, 2, 0),
                Arguments.of(1005, 6, 167.5),
                Arguments.of(-1, 10, -0.1),
                Arguments.of(-10, -10, 1),
                Arguments.of(-0.1, -10, 0.01),
                Arguments.of(0.1, -10, -0.01),
                Arguments.of(1000, -10, -100),
                Arguments.of(0.1, 0.1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForDivideNumbersTest")
    public void divideNumbersTest_WithoutDivisionByZero(double number1, double number2, double result) {
        assertEquals(result, Calculator.divideNumbers(number1, number2),
                "Expected result " + result + ", but actual " + Calculator.divideNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }

    @RepeatedTest(5)
    public void divideNumbersByZeroTestShouldThrowException() {
        assertThrows(ArithmeticException.class, () -> Calculator.divideNumbers(Math.random(), 0));
    }

}
