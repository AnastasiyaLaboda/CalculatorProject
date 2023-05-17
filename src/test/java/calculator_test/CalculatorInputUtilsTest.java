package calculator_test;

import calculator.CalculatorInputUtils;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static calculator.CalculatorInputUtils.getNumber;
import static java.lang.String.format;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorInputUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"+", "-", "*", "/"})
    public void getOperator_shouldReturnValidOperatorWhenOperatorIsEntered(String expectedOperator) {
        InputStream in = new ByteArrayInputStream(expectedOperator.getBytes());
        System.setIn(in);
        String inputOperator = CalculatorInputUtils.getOperator();
        assertEquals(expectedOperator, inputOperator,
                format("User entered %s, but get %s", expectedOperator, inputOperator));
    }

    @RepeatedTest(10)
    void getNumber_shouldReturnNumberWhenNumberIsEntered() {
        double enteredNumber = Math.random() * 10;
        InputStream in = new ByteArrayInputStream(Double.toString(enteredNumber).getBytes());
        System.setIn(in);
        double actualNumber = getNumber();
        assertEquals(enteredNumber, actualNumber,
                format("User entered %s, but get %s", enteredNumber, actualNumber));
    }
}
