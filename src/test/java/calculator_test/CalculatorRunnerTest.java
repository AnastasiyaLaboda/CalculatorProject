package calculator_test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static calculator.Runner.calculate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorRunnerTest {

    @ParameterizedTest
    @CsvSource(value = {"10,+,10,20", "10,-,10,0", "10,*,10,100", "10,/,10,1"})
    public void calculateMethodWithDifferentOperators_returnsCorrectResult(double num1, String operator, double num2, double result) {
        assertEquals(result, calculate(num1, operator, num2),
                "Expected result " + result + ", but actual " + calculate(num1, operator, num2) + " for " + num1 + operator + num2);
    }

    @ParameterizedTest
    @EmptySource
    @ValueSource(strings = {"h", "///", "aaa", "300", "!"})
    public void calculateMethodWithInvalidOperatorShouldThrowException(String invalidOperator) {
        assertThrows(IllegalStateException.class, () -> calculate(1, invalidOperator, 1));
    }
}
