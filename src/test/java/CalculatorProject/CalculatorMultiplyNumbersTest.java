package CalculatorProject;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)
public class CalculatorMultiplyNumbersTest {

    private static Stream<Arguments> provideNumbersForMultiplyNumbersTest() {
        return Stream.of(
                Arguments.of(10, 2, 20),
                Arguments.of(0, 2, 0),
                Arguments.of(5, 0, 0),
                Arguments.of(-1, 10, -10),
                Arguments.of(-1, -10, 10),
                Arguments.of(-0.1, -10, 1),
                Arguments.of(0.1, -10, -1),
                Arguments.of(1000, -10, -10000),
                Arguments.of(0.1, 0.1, 0.1 * 0.1)
        );
    }

    @ParameterizedTest
    @MethodSource("provideNumbersForMultiplyNumbersTest")
    public void multiplyNumbersTest(double number1, double number2, double result) {
        assertEquals(result, Calculator.multiplyNumbers(number1, number2),
                "Expected result " + result + ", but actual " + Calculator.multiplyNumbers(number1, number2) + " for numbers " + number1 + " and " + number2);
    }
}
