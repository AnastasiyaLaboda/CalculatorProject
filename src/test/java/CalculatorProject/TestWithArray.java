//package CalculatorProject;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.CsvSource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class TestWithArray {
//
//    private static final double[][] NUMBERS_FOR_SUBTRACT_TEST = {
//            {3, 2, 1},
//            /*{15, 5, 10},
//            {400, 0, 400},*/
//            /* {1.3, 0.2, 1.1},
//             {15.15, 5.15, 10},
//             {0.5, 0.5, 0},
//             {100, 0.1, 99.9},
//             {100, -0.1, 100.1},*/
//            /*{-5, -5, 0}*/
//    };
//
//
//    @ParameterizedTest
//    //@MethodSource("NUMBERS_FOR_SUBTRACT_TEST")
//    @CsvSource(NUMBERS_FOR_SUBTRACT_TEST)
//    public void subtractNumbersTest(double number1, double number2, double result) {
//        assertEquals(result, Calculator.subtractNumbers(number1, number2), "Subtract in the Calculator does not work correctly");
//    }
//
//}
