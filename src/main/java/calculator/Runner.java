package calculator;

import static calculator.Calculator.*;
import static calculator.CalculatorInputUtils.*;

public class Runner {
    public static void main(String[] args) {

        double result = calculate(getNumber(), getOperator(), getNumber());
        System.out.println("Result: " + result + "\n");
    }

    public static double calculate(double number1, String operator, double number2) {
        return switch (operator) {
            case "+" -> addNumbers(number1, number2);
            case "-" -> subtractNumbers(number1, number2);
            case "*" -> multiplyNumbers(number1, number2);
            case "/" -> divideNumbers(number1, number2);
            default -> throw new IllegalStateException("Unexpected operator");
        };
    }

}
